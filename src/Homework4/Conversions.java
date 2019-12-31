package Homework4;

public class Conversions {
    public static void main(String args[]){
        double C = 20;
        double K = 20;
        double Kelvin = C +273.15;
        double Celsius = K - 273.15;
        double Fahrenheit = ((K - 273.15) * 9/5 ) + 32;
        double Fah = (C * 9/5) + 32;
        System.out.println("Celsius to Kelvin : " + Kelvin);
        System.out.println("Celsius to Fahrenheit : " + Fah);
        System.out.println("Kelvin to Celsius : " + Celsius);
        System.out.println("Kelvin to Fahrenheit : " + Fahrenheit);
    }
}
