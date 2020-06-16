package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AnimalRescuerGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name and available money!");
        Player player = new Player(scanner.next(),scanner.nextDouble());

        System.out.println("Enter vet name and specialiation!");
        Vet vet = new Vet(scanner.next(),scanner.next());

        System.out.println("Enter food name and price");
        PetFood food = new PetFood(scanner.next(),scanner.nextInt());

        System.out.println("Enter activity name and duration!");
        RecreationActivity recreation = new RecreationActivity(scanner.next(),scanner.nextInt());

        System.out.println("[Dog] Enter your pet name!");
        String dogName = scanner.next();
        System.out.println("[Dog] Enter your pet breed!");
        String dogBreed = scanner.next();
        System.out.println("[Dog] Enter your pet favorite food!");
        String dogFavoriteFood = scanner.next();
        System.out.println("[Dog] Enter your pet favorite activity!");
        String dogFavoriteActivity = scanner.next();
        Dog dog = new Dog(dogName,dogBreed,dogFavoriteFood,dogFavoriteActivity);
        System.out.println("[Dog] Your pet name is: " + dog.name);
        System.out.println("[Dog] Your pet breed is: " + dog.breed);
        System.out.println("[Dog] Your pet favorite food is: " + dog.favoriteFood);
        System.out.println("[Dog] Your pet favorite activity is: " + dog.favoriteActivity);


        dog.bark = true;
        dog.isBarking();

        System.out.println("[Cat] Enter your pet name!");
        String catName = scanner.next();
        System.out.println("[Cat] Enter your pet breed!");
        String catBreed = scanner.next();
        System.out.println("[Cat] Enter your pet favorite food!");
        String catFavoriteFood= scanner.next();
        System.out.println("[Cat] Enter your pet favorite activity!");
        String catFavoriteActivity= scanner.next();
        Cat cat = new Cat(catName,catBreed,catFavoriteFood,catFavoriteActivity);
        System.out.println("[Cat] Your pet name is: " + cat.name);
        System.out.println("[Cat] Your pet breed is: " + cat.breed);
        System.out.println("[Cat] Your pet favorite food is: " + cat.favoriteFood);
        System.out.println("[Cat] Your pet activity is: " + cat.favoriteActivity);

        cat.purrs = true;
        cat.isPurrsing();

        player.feedThePet(dog,food);
        player.playWithPet(recreation,dog);

        dog.petMoral();
        cat.petMoral();

    }

}
