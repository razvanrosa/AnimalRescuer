package org.fasttrackit;

public class Dog extends Pet {

    boolean bark;
    boolean bites;

    public Dog(String name,String breed,String favoriteFood,String favoriteActivity){
        super(name, breed,favoriteFood,favoriteActivity);
    }

    public void isBarking(){
        if(bark){
            System.out.println("Ham Ham!");
        }
    }

}
