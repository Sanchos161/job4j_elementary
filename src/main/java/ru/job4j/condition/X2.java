package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }

    public static void whenA1B1C1X1Then3(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }

    public void whenA0B1C1XThen2(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }

    public void whenA0B1C1XThen1(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
    }

