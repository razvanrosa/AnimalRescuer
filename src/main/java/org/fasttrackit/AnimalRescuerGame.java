package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AnimalRescuerGame {

    public static void app() {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player();

        Vet vet = new Vet();

        Pet pet = new Pet();

        PetFood.initAvailableFood();
        PetFood.displayAvailableFood();

        RecreationActivity.initRecreationActivities();
        RecreationActivity.displayRecreationActivities();

        Pet dog = Dog.initDog();
        ((Dog) dog).bark = true;
        ((Dog) dog).isBarking();

        Pet cat = Cat.initCat();
        ((Cat) cat).purrs = true;
        ((Cat) cat).isPurrsing();

        player.feedThePet(dog,PetFood.getAvailableFood().get(0));
        player.playWithPet(RecreationActivity.getRecreationActivities()[0] , dog);

        dog.petMoral();
        cat.petMoral();

    }

}
