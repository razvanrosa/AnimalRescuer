package org.fasttrackit;

public class Dog extends Pet {

    boolean bark;
    boolean bites;

    public Dog(String name,String breed){
        super(name, breed);
    }

    public void isBarking(){
        if(bark){
            System.out.println("Ham Ham!");
        }
    }

}
