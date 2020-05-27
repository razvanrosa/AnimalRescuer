package org.fasttrackit;

import java.util.Scanner;

public class AnimalRescuerGame {

    public static void main(String[] args) {

        Player player = new Player("Razvan",700);

        Vet vet = new Vet("Mark","General Practitioner");

        Cat cat = new Cat ("Tom");

        PetsFood food = new PetsFood("Akana");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pet name!");
        String dogName = scanner.next();
        Dog dog = new Dog(dogName);
        System.out.println("Your pet name is: " + dog.name);

    }

}
