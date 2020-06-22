package org.fasttrackit;

import java.util.Scanner;

public class Dog extends Pet {

    boolean bark;
    boolean bites;

    public static Dog initDog(){
        Scanner scanner = new Scanner(System.in);

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
        return dog;
    }

    public Dog(String name, String breed, String favoriteFood, String favoriteActivity){
        super(name, breed,favoriteFood,favoriteActivity);
    }

    public void isBarking(){
        if(bark){
            System.out.println("Ham Ham!");
        }
    }

    @Override
    public void petMoral(){
        System.out.println(name + " Wags its tail !!");
    }

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public boolean isBites() {
        return bites;
    }

    public void setBites(boolean bites) {
        this.bites = bites;
    }

}
