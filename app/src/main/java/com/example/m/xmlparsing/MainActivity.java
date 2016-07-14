package com.example.m.xmlparsing;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MainActivity extends AppCompatActivity {
    String twojStary;
    static final String URLAPI ="http://api.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=ff2485070e13592527b9e2ee86779d74";
    TextView tekst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tekst=(TextView)findViewById(R.id.textView);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Watek().execute();
            }
        });
    }



    public class Watek extends AsyncTask<Void,String,String>{
        String everything;

        @Override
        protected String doInBackground(Void... params) {
            try {
                URL website = new URL(URLAPI);
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser parser = factory.newSAXParser();
                XMLReader reader = parser.getXMLReader();
                XmlHandler handler = new XmlHandler();
                reader.setContentHandler(handler);
                reader.parse(new InputSource(website.openStream()));
                everything = handler.getEverything();




            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return everything;
        }


        @Override
        protected void onPostExecute(String params) {
            super.onPostExecute(params);
            tekst.setText(params);



        }
    }
}
