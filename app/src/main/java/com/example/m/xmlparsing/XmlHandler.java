package com.example.m.xmlparsing;

import android.util.Log;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by m on 2016-07-14.
 */
public class XmlHandler extends DefaultHandler {
    int count=0;
    XmlCollect collect = new XmlCollect();
    public String getEverything(){
        return  collect.dataReturn();


    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(localName!=null){
            Log.d("Uwaga","lolz"+count);
            count++;
        }

        
        else if (localName.equals("country")){


            collect.setCountry(attributes.getLocalName(6));
        }

        else if (localName.equals("temperature")){


            collect.setTemperaturemin(attributes.getValue("min"));
            collect.setTemperaturemax(attributes.getValue("max"));
        }


    }
}
