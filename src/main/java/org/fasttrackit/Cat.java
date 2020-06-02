package org.fasttrackit;

public class Cat extends Pet {

    boolean purrs;
    boolean scratch;

    public Cat(String name,String breed){
       super(name,breed);
    }

    public void isPurrsing(){
        if(purrs){
            System.out.println("Mrrrrrrrrr");
        }
    }
}
