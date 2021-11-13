package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        possibleDiv(1, 2, 3);

    }

    public static void possibleDiv(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max);
    }
}
