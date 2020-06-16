package org.fasttrackit;

public class Cat extends Pet {

    boolean purrs;
    boolean scratch;

    public Cat(String name, String breed, String favoriteFood, String favoriteActivity){
       super(name,breed,favoriteFood,favoriteActivity);
    }

    public void isPurrsing(){
        if(purrs){
            System.out.println("Mrrrrrrrrr");
        }
    }

    @Override
    public void petMoral(){
        System.out.println(name + " Purrs!!");
    }

    public boolean isPurrs() {
        return purrs;
    }

    public void setPurrs(boolean purrs) {
        this.purrs = purrs;
    }

    public boolean isScratch() {
        return scratch;
    }

    public void setScratch(boolean scratch) {
        this.scratch = scratch;
    }
}
