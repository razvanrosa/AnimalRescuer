package org.fasttrackit;

public class Cat extends Pet {

    public Cat(String name){
        this.name = name;
    }

    boolean purrs;
    boolean scratch;

    public void isPurrsing(){
        if(purrs){
            System.out.println("Mrrrrrrrrr");
        }
    }
}
