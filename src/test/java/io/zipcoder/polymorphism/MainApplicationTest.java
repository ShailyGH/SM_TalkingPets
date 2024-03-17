package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void testMe()
{

}
    @Test
    public void testDogClass(){
        Dog dog = new Dog("spike");
        String dogNameActual = dog.getName();
        String dogNameExpectation = "spike";
        Assert.assertEquals(dogNameExpectation,dogNameActual);
    }
}
