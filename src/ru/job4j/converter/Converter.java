package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
}

    public static int rubleToDollar(int value) {
        int dollar = value / 60;
        return dollar;

    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are" + euro + "euro.");
        int dollar = Converter.rubleToDollar(600);
        System.out.println("600 rubles are"+ dollar+ "dollar.");

    }

}