package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
    double rsl = -1;
    return rsl;
}

    public static double womanWeight(short height) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
         height = 170;
        double woman = Fit.manWeight(height);
        System.out.println("woman 170 is" + woman);
        System.out.println("Man 187 is " + man);
    }

}
