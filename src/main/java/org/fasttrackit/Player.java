package org.fasttrackit;

public class Player {

    String name;
    double availebleMoney;

    public Player(String name,double availebleMoney){
        this.name = name;
        this.availebleMoney = availebleMoney;
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

}
