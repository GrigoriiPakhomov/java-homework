package main.java.temperatureConverter;

public class Converter {
     public static double convert(double temp, TempUnit from, TempUnit to) {
          if (from == to) return temp;

           double outCelsius = switch (from){
                case CELSIUS -> temp;
                case FAHRENHEIT -> (temp - 32) * 5 / 9;
                case KELVIN -> temp - 273.15;
           };

          double outFahrenheit = switch (from) {
               case CELSIUS -> temp * 9 / 5 + 32;
               case FAHRENHEIT -> temp;
               case KELVIN -> (temp - 273.15) * 9 / 5 + 32;
          };

          double outKelvin = switch (from) {
               case CELSIUS -> temp + 273.15;
               case FAHRENHEIT -> (temp - 32) * 5 / 9 + 273.15;
               case KELVIN -> temp;
          };


          return switch (to) {
               case CELSIUS -> outCelsius;
               case FAHRENHEIT -> outFahrenheit;
               case KELVIN -> outKelvin;
          };
     }
}
