package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        boolean age1 = 21 > 16;
        System.out.println("The age of the customer is : " + age);
        if (age1) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
