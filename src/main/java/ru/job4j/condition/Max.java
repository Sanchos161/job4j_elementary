package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        return  left > right ? left : right;
    }

    public static int summation(int first, int second) {
        boolean condition = first > second;
        return first > second ? first : second;
    }

}


