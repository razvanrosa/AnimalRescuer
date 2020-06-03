package org.fasttrackit;

public class Cat extends Pet {

    boolean purrs;
    boolean scratch;

    public Cat(String name,String breed,String favoriteFood,String favoriteActivity){
       super(name,breed,favoriteFood,favoriteActivity);
    }

    public void isPurrsing(){
        if(purrs){
            System.out.println("Mrrrrrrrrr");
        }
    }
}
