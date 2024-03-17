package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testCatName()
    {
        Cat cat = new Cat("Browny");
        String catNameActual = cat.getName();
        String catNameExpectation = "Browny";
        Assert.assertEquals(catNameExpectation,catNameActual);
    }

    @Test
    public void speakTest()
    {
        Pet cat = new Cat();
        String expected = "Meow !!!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}
