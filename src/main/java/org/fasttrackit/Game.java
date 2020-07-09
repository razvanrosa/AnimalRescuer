package org.fasttrackit;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static Pet pet;
    private static Player rescuer;

    private static List<Class> pets = new ArrayList<Class>(){{
        add(Dog.class);
        add(Cat.class);
    }};


    public static void main(String[] args) {

    }

    public void start(){

        initAnimal();
        initRescuer();
        nameAnimal();

        boolean keepPlaying = true;
        while (keepPlaying){

            System.out.println("PLAY WITH THE PET");
            requireActivity();
            System.out.println("FEED THE PET");
            requireFeeding();
            if(pet.moralLevel <= 0 || pet.healtLevel <= 0 || pet.hungryLevel <= 0 ){
                keepPlaying = false;
                System.out.println("YOU LOSE");
            }else  if (pet.moralLevel == 10 || pet.healtLevel == 10 || pet.hungryLevel == 10 ){
                keepPlaying = false;
                System.out.println("YOU WINN");
            }
        }




    }

    private void requireActivity() {
        System.out.println("Please choose one or none from the following activities");

        RecreationActivity.initRecreationActivities();
        RecreationActivity.displayRecreationActivities();
        System.out.println("0. None");



        Scanner input = new Scanner(System.in);

        int userChoice = 0;

        try {
            userChoice = input.nextInt();

            if(userChoice < 0 || userChoice >4){
                System.out.println("You entered an invalid value! Try again.");
                requireActivity();
            }

        }catch (Exception exception){
            System.out.println("You entered an invalid value! Try again.");
            requireActivity();
        }

        switch (userChoice) {
            case 0:
                break;
            case 1:
                rescuer.playWithPet(RecreationActivity.getRecreationActivities()[0], pet);
                break;
            case 2:
                rescuer.playWithPet(RecreationActivity.getRecreationActivities()[1], pet);
                break;
            case 3:
                rescuer.playWithPet(RecreationActivity.getRecreationActivities()[2], pet);
                break;
            case 4:
                rescuer.playWithPet(RecreationActivity.getRecreationActivities()[3], pet);
                break;
        }

    }

    private static void initAnimal() {
        System.out.println("Choose your pet!");

        for (int i = 0; i < pets.size(); i++) {
            System.out.println(i + 1 + ". " + pets.get(i).getSimpleName());
        }

        Scanner input = new Scanner(System.in);
        int userChoice = 0;

        try {
           userChoice = input.nextInt();

            if(userChoice < 1 || userChoice >2){
                System.out.println("You entered an invalid value! Try again.");
                initAnimal();
            }

        }catch (Exception exception){
            System.out.println("You entered an invalid value! Try again.");
            initAnimal();
        }

        switch (userChoice) {
            case 1:
                pet = Dog.createAdandonedDog();
                break;
            case 2:
                pet = Cat.createAdandonedCat();
                break;
        }
    }

    private void nameAnimal(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pet name!");
        String petName = input.next();

        pet.setName(petName);
    }

    private void requireFeeding(){

        System.out.println("Please choose one or none from the following foods");

        PetFood.initAvailableFood();
        PetFood.displayAvailableFood();
        System.out.println("0. None");


        Scanner input = new Scanner(System.in);

        int userChoice = 0;

        try {
            userChoice = input.nextInt();

            if(userChoice < 0 || userChoice >6){
                System.out.println("You entered an invalid value! Try again.");
                requireFeeding();
            }

        }catch (Exception exception){
            System.out.println("You entered an invalid value! Try again.");
            requireFeeding();
        }

        switch (userChoice) {
            case 0:
                break;
            case 1:
                rescuer.feedThePet(pet, PetFood.getAvailableFood().get(0));
                break;
            case 2:
                rescuer.feedThePet(pet, PetFood.getAvailableFood().get(1));
                break;
            case 3:
                rescuer.feedThePet(pet, PetFood.getAvailableFood().get(2));
                break;
            case 4:
                rescuer.feedThePet(pet, PetFood.getAvailableFood().get(3));
                break;
            case 5:
                rescuer.feedThePet(pet, PetFood.getAvailableFood().get(4));
                break;
            case 6:
                rescuer.feedThePet(pet, PetFood.getAvailableFood().get(5));
                break;
        }


    }

    public static void initRescuer(){
        rescuer = Player.initPlayer();
    }

}
