package ru.job4j.ru.job4j;

public class Example3 {
    public static void main(String args[]) {
        int var; // объявление целочисленной переменной
        double x; // объявление переменной с плавающей точкой

        var = 10; // присваивание переменной var  значения 10.0

        x = 10.0; // присваивание переменной x значения 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println(); // печать пустой строки

        // Деление значения обеих переменных на 4
        var = var/4;
        x = x/4;
        System.out.println("Значение переменной var после деления: " + var);

        System.out.println("Значение переменной x после деления: " + x);
    }
}
