package ru.job4j.condition;
import static ru.job4j.math.MathFunction.*;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K1Square2() {
        double expected = 2.25;
        int p = 6;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K1Square3() {
       double expected = 0.5625;
        int p = 3;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}