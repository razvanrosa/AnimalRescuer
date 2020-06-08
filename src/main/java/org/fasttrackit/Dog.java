package org.fasttrackit;

public class Dog extends Pet {

    boolean bark;
    boolean bites;

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public boolean isBites() {
        return bites;
    }

    public void setBites(boolean bites) {
        this.bites = bites;
    }

    public Dog(String name, String breed, String favoriteFood, String favoriteActivity){
        super(name, breed,favoriteFood,favoriteActivity);
    }

    public void isBarking(){
        if(bark){
            System.out.println("Ham Ham!");
        }
    }

}
