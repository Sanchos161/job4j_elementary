package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {

        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.dollarToEuro(70);
        System.out.println("60  dollar are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
         dollar = Converter.euroToDollar(60);
        System.out.println("70 dollar are " + dollar + " dollar.");

    }
}