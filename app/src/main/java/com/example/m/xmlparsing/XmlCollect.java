package com.example.m.xmlparsing;

/**
 * Created by m on 2016-07-14.
 */
public class XmlCollect {
    String cityName;
    int lon=0;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTemperaturemax() {
        return temperaturemax;
    }

    public void setTemperaturemax(String temperaturemax) {
        this.temperaturemax = temperaturemax;
    }
public String dataReturn (){
    return cityName+"    "+ country +"  "+temperaturemax+"    "+temperaturemin;

}
    int lat=0;
    String country;
    String temperaturemax;

    public String getTemperaturemin() {
        return temperaturemin;
    }

    public void setTemperaturemin(String temperaturemin) {
        this.temperaturemin = temperaturemin;
    }

    String temperaturemin;

}
