package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication
{

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        int numberOfPets = 0;
        String typeOfPet = "", nameOfPet = "";

        // get user input
        Scanner inputNoOfPets = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        numberOfPets = inputNoOfPets.nextInt();

        for (int i = 0; i < numberOfPets; i++)
        {
            // get user input on type of pet
            Scanner inputTypeOfPets = new Scanner(System.in);
            System.out.print("What kind of pet do you have? ");
            typeOfPet = inputTypeOfPets.next();

            // get user input on name of pet
            Scanner inputNameOfPets = new Scanner(System.in);
            System.out.print("What is the name of your pet? ");
            nameOfPet = inputNameOfPets.next();

            if(typeOfPet.equalsIgnoreCase("cat"))
            {
                System.out.println("Created Cat " + nameOfPet + " as a pet");
                Cat cat = new Cat(nameOfPet);
                pets.add(cat);
            }
            else if (typeOfPet.equalsIgnoreCase("dog"))
            {
                System.out.println("Created Dog named " + nameOfPet + " as a pet");
                Dog dog = new Dog(nameOfPet);
                pets.add(dog);
            }
            else if (typeOfPet.equalsIgnoreCase("bird"))
            {
                System.out.println("Created Bird " + nameOfPet + " as a pet");
                Bird bird = new Bird(nameOfPet);
                pets.add(bird);
            }
        }
        System.out.println("User has " + pets.size() + " Pets; Their names are ");
        for (Pet pet: pets)
        {
            System.out.println(pet.name );
        }
        for (Pet pet: pets)
        {
            System.out.print(pet.name + " says ");
            pet.speak();
        }
    }
}
