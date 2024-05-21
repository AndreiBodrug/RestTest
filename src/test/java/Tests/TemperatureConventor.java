package Tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.StepsForTempConvert;

public class TemperatureConventor {

    @Test
    public static void CelsiusToFahrenheit(){
        StepsForTempConvert temp = new StepsForTempConvert(0, "Celsius", "Fahrenheit");
        double result = temp.temperatureConventer();
        Assert.assertEquals(result, 32);
        //System.out.println("Test case for Celsius -> Fahrenheit " + (result == 32 ? "Passed" : "Failed"));
    }

    @Test
    public static void CelsiusToKelvin(){
        StepsForTempConvert temp = new StepsForTempConvert(0, "Celsius", "Kelvin");
        double result = temp.temperatureConventer();
        Assert.assertEquals(result, 273.15);
        //System.out.println("Test case for Celsius -> Kelvin " + (result == 273.15 ? "Passed" : "Failed"));
    }

    @Test
    public static void FahrenheitToCelsius(){
        StepsForTempConvert temp = new StepsForTempConvert(0, "Fahrenheit", "Celsius");
        double result = temp.temperatureConventer();
        Assert.assertEquals(result, 17.7777);
        //System.out.println("Test case for Fahrenheit -> Celsius " + (result == 17.7777 ? "Passed" : "Failed"));
    }

    @Test
    public static void FahrenheitToKelvin(){
        StepsForTempConvert temp = new StepsForTempConvert(0, "Fahrenheit", "Kelvin");
        double result = temp.temperatureConventer();
        Assert.assertEquals(result, 255.3722);
        //System.out.println("Test case for Fahrenheit -> Kelvin " + (result == 255.3722 ? "Passed" : "Failed"));
    }

    @Test
    public static void KelvinToCelsius(){
        StepsForTempConvert temp = new StepsForTempConvert(0, "Kelvin", "Celsius");
        double result = temp.temperatureConventer();
        Assert.assertEquals(result, -273.15);
        //System.out.println("Test case for Kelvin -> Celsius " + (result == -273.15 ? "Passed" : "Failed"));
    }

    @Test
    public static void KelvinToFahrenheit(){
        StepsForTempConvert temp = new StepsForTempConvert(0, "Kelvin", "Fahrenheit");
        double result = temp.temperatureConventer();
        Assert.assertEquals(result, 0);
        //System.out.println("Test case for Kelvin -> Fahrenheit " + (result == 0 ? "Passed" : "Failed"));
    }

}
