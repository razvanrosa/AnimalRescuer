package org.fasttrackit;

import java.util.Scanner;

public class AnimalRescuerGame {

    public static void main(String[] args) {

        Player player = new Player("Razvan",700);

        Vet vet = new Vet("Mark","General Practitioner");

        PetFood food = new PetFood("Akana",270);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pet name!");
        String dogName = scanner.next();
        System.out.println("Enter your pet breed!");
        String dogBreed = scanner.next();
        Dog dog = new Dog(dogName,dogBreed);
        System.out.println("Your pet name is: " + dog.name);
        System.out.println("Your pet breed is: " + dog.breed);

        dog.bark = true;
        dog.isBarking();

        System.out.println("Enter your pet name!");
        String catName = scanner.next();
        System.out.println("Enter your pet breed!");
        String catBreed = scanner.next();
        Cat cat = new Cat(catName,catBreed);
        System.out.println("Your pet name is: " + cat.name);
        System.out.println("Your pet breed is: " + cat.breed);

        cat.purrs = true;
        cat.isPurrsing();

        RecreationActivity recreation = new RecreationActivity("play with frissbee",30);

    }

}
