package io.zipcoder.polymorphism;

public class Cat extends Pet
{
    public Cat(String name)
    {
        super(name);
    }

    public Cat()
    {

    }

    @Override
    public String speak()
    {
        System.out.println("Meow !!!");
        return "Meow !!!";
    }
}
