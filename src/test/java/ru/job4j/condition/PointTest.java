package ru.job4j.condition;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Point;

public class PointTest {
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}