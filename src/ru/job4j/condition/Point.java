package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int result = x2 - x1;
        int result1 = y2 - y1;
        double result2 = Math.pow(result, 2);
        double result3 = Math.pow(result1, 2);
        double result4 = result2 + result3;
        return Math.sqrt(result4);

    }


    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

    }
}