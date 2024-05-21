package utils;

import Tests.TemperatureConventor;
import io.qameta.allure.Step;

import static java.lang.Math.round;

public class StepsForTempConvert {

    private double temperature;
    private String initialMeasure;
    private String conversionMeasure;

    public StepsForTempConvert(double temperature, String initialMeasure, String conversionMeasure) {
        this.temperature = temperature;
        this.initialMeasure = initialMeasure;
        this.conversionMeasure = conversionMeasure;
    }
    @Step
    public double temperatureConventer(){
        double result = 0;
        if(initialMeasure.equals("Celsius") && this.conversionMeasure.equals("Fahrenheit")){
            result =(((this.temperature*2)/100)*100) + 32.0;
        }else if(this.initialMeasure.equals("Celsius") && this.conversionMeasure.equals("Kelvin")){
            result = ((this.temperature + 273.15));
        }else if(this.initialMeasure.equals("Fahrenheit") && this.conversionMeasure.equals("Celsius")){
            result = ((this.temperature - 32)*5/9);
        }else if(this.initialMeasure.equals("Fahrenheit") && this.conversionMeasure.equals("Kelvin")){
            result = (((this.temperature - 32)*5/9) + 273.15);
        }else if(this.initialMeasure.equals("Kelvin") && this.conversionMeasure.equals("Celsius")) {
            result = (this.temperature - 273.15);
        }else if(this.initialMeasure.equals("Kelvin") && this.conversionMeasure.equals("Fahrenheit")){
            result = ((this.temperature - 32)*5/9) + 32;
        }else {
            System.out.println("Wrong input");
        }
        return result;
    }
}
