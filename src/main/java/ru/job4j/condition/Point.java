package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }

    public static void when10to20then3(String[] args) {
        double result = Point.distance(1, 0, 2, 0);
        System.out.println("result (1, 0) to (2, 0) " + result);
    }

    public static void when10to21then4(String[] args) {
        double result = Point.distance(1, 0, 2, 1);
        System.out.println("result (1, 0) to (2, 1) " + result);
    }

    public static void when21to20then5(String[] args) {
        double result = Point.distance(2, 1, 2, 0);
        System.out.println("result (2, 1) to (2, 0) " + result);
    }
}