package org.temp.converter;

import net.webservicex.ConvertTemperature;
import net.webservicex.ConvertTemperatureSoap;
import net.webservicex.TemperatureUnit;

/**
 * Created by neeraj on 24/10/14.
 */

public class TempConverter {
    public static void main(String args[]){

            System.out.print("Converting celsius to fahrenheit");
            ConvertTemperature convertTemperature=new ConvertTemperature();
            ConvertTemperatureSoap convertTemperatureSoap= convertTemperature.getConvertTemperatureSoap();
            TemperatureUnit fromTemp=TemperatureUnit.DEGREE_CELSIUS;
            TemperatureUnit toTemp=TemperatureUnit.DEGREE_FAHRENHEIT;
            System.out.println("Temperature in Fahrenheit: "+convertTemperatureSoap.convertTemp(25.5, fromTemp, toTemp));


    }
}
