package ru.job4j.condition;

public class AlertDivZero {
    public static void main(String[] args) {
        possibleDiv(1);
        possibleDiv(-17);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
