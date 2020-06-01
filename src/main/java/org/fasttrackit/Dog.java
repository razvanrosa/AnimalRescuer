package org.fasttrackit;

public class Dog extends Pet {

    public Dog(String name){
        this.name = name;
    }

    boolean bark;
    boolean bites;

    public void isBarking(){
        if(bark){
            System.out.println("Ham Ham!");
        }
    }




}
