package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0y0x2y0Then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);

    }
    @Test
    public void whenX1x2y1y2Then2() {
        double expected = 1.41;
        int x1 = 1, x2 = 2, y1 = 1, y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenX1x0y1y3Then141() {
        double expected = 3.16;
        int x1 = 1, x2 = 0, y1 = 0, y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }
}
