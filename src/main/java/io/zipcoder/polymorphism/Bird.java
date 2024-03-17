package io.zipcoder.polymorphism;

public class Bird extends Pet
{
    public Bird(String name)
    {
        super(name);
    }

    @Override
    public void speak()
    {
        System.out.println("Chirp !!!");
    }
}
