package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;


public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP12K1Then9() {
        int expected = 9;
        int p = 12;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}