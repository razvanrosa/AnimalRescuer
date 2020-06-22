package org.fasttrackit;

import java.util.Scanner;

public class Player {

    String name;
    double availableMoney;

    public Player(){
    }

    public Player(String name, double availableMoney){
        this.name = name;
        this.availableMoney = availableMoney;
    }

    public static void initPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and available money!");
        Player player = new Player(scanner.next(),scanner.nextDouble());
    }

    public void feedThePet(Pet pet,PetFood food){
        if( food.name.equals(pet.favoriteFood)){
            pet.hungryLevel--;
            pet.moralLevel++;
        }else {
            pet.hungryLevel--;
        }
        System.out.println(this.name + " " + "just gave some" + " " + food.name + " " + "to" + " " + pet.name);
        System.out.println("Pet hungry level is: " + pet.hungryLevel);
        System.out.println("Pet moral level is : " + pet.moralLevel);
    }

    public void playWithPet(RecreationActivity recreation,Pet pet){
        if(recreation.name.equals(pet.favoriteActivity)){
            pet.moralLevel = pet.moralLevel +2;
        }else {
            pet.moralLevel++;
        }
        System.out.println(this.name + " " + "is playing" + " " + recreation.name + " " + "with" + " " + pet.name + "for" + " " + recreation.duration + " " + "minutes");
        System.out.println("Pet moral level is : " + pet.moralLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

}
