package org.fasttrackit;

import java.util.Scanner;

public class Cat extends Pet {

    boolean purrs;
    boolean scratch;

    public static Cat initCat(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Cat] Enter your pet name!");
        String catName = scanner.next();
        System.out.println("[Cat] Enter your pet breed!");
        String catBreed = scanner.next();
        System.out.println("[Cat] Enter your pet favorite food!");
        String catFavoriteFood = scanner.next();
        System.out.println("[Cat] Enter your pet favorite activity!");
        String catFavoriteActivity = scanner.next();
        Cat cat = new Cat(catName,catBreed,catFavoriteFood,catFavoriteActivity);
        System.out.println("[Dog] Your pet name is: " + cat.name);
        System.out.println("[Dog] Your pet breed is: " + cat.breed);
        System.out.println("[Dog] Your pet favorite food is: " + cat.favoriteFood);
        System.out.println("[Dog] Your pet favorite activity is: " + cat.favoriteActivity);
        return cat;
    }

    public Cat(String name, String breed, String favoriteFood, String favoriteActivity){
       super(name,breed,favoriteFood,favoriteActivity);
    }

    public void isPurrsing(){
        if(purrs){
            System.out.println("Mrrrrrrrrr");
        }
    }

    @Override
    public void petMoral(){
        System.out.println(name + " Purrs!!");
    }

    public boolean isPurrs() {
        return purrs;
    }

    public void setPurrs(boolean purrs) {
        this.purrs = purrs;
    }

    public boolean isScratch() {
        return scratch;
    }

    public void setScratch(boolean scratch) {
        this.scratch = scratch;
    }
}
