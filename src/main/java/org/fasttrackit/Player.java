package org.fasttrackit;

public class Player {

    String name;
    double availebleMoney;

    public Player(String name,double availebleMoney){
        this.name = name;
        this.availebleMoney = availebleMoney;
    }

    public void feedThePet(Pet pet,PetFood food){
        pet.hungryLevel--;
        System.out.println(this.name + " " + "just gave some" + " " + food.name + " " + "to" + " " + pet.name);
    }
    public void playWithPet(RecreationActivity recreation,Pet pet){
        pet.moralLevel++;
        System.out.println("this.name" + " " + "is playing" + " " +recreation.name +" "+ "with" + " " + pet.name + "for" + " " +recreation.duration + " " + "minutes" );
    }

}
