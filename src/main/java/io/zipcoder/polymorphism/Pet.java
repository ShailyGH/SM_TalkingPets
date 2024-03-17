package io.zipcoder.polymorphism;

public class Pet
{
    public String name;

    public Pet() {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Pet(String name)
    {
        this.name = name;
    }

    public String speak()
    {
        System.out.println("Pet speaks !!!");
        return "";
    }



}
