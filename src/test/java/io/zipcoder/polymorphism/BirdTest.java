package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest
{
    @Test
    public void testBirdName()
    {
        Bird bird = new Bird("Robin");
        String birdNameActual = bird.getName();
        String birdNameExpectation = "Robin";
        Assert.assertEquals(birdNameExpectation,birdNameActual);
    }

    @Test
    public void speakTest()
    {
        Pet bird = new Bird();
        String expected = "Chirp !!!";
        String actual = bird.speak();
        Assert.assertEquals(expected, actual);
    }
}
