package ru.job4j;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
    }

    public static int func2(int x) {
        int y = x * 10;
    }

    public static void main(String[] args) {
        MathFunc.func1(3);
        MathFunc.func2(5);
    }
}