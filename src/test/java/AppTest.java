package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        Assert.assertEquals(5, App.add(2, 3));
        Assert.assertEquals(0, App.add(-1, 1));
    }
}
