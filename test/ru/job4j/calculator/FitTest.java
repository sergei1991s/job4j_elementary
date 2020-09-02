package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
public class FitTest {

    @Test
    public void whenman180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenwoman170Then89() {
        short in = 170;
        double expected = 89;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}