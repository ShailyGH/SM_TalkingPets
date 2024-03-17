package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest
{
    @Test
    public void testDogName()
    {
        Dog dog = new Dog("Cocoa");
        String dogNameActual = dog.getName();
        String dogNameExpectation = "Cocoa";
        Assert.assertEquals(dogNameExpectation,dogNameActual);
    }

    @Test
    public void speakTest()
    {
        Pet dog = new Dog();
        String expected = "Woof !!!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

}
