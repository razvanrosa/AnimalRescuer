package org.fasttrackit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PetFood {

    static List<PetFood> availableFood = new ArrayList<>();

    public static void initAvailableFood(){
        availableFood.add(new PetFood("Acanna",200));
        availableFood.add(new PetFood("Taste Of The Wild", 250));
        availableFood.add(new PetFood("Purina",150));
        availableFood.add(new PetFood("Sheba",60));
        availableFood.add(new PetFood("Friskies",17));
        availableFood.add(new PetFood("Whiskas", 25));
    }

    public static void displayAvailableFood() {

        System.out.println("Available food: ");
        for (PetFood food : availableFood) {
            if (food != null)
                System.out.println("Pet food is: " + food.getName() + " And price is: " + food.getPrice());
        }
    }

    String name;
    double price;
    String flavor;
    int quantity;
    int availableQuantity;
    LocalDateTime expireDate;

    public PetFood(String name,double price){
        this.name = name;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public static List<PetFood> getAvailableFood() {
        return availableFood;
    }

    public static void setAvailableFood(List<PetFood> availableFood) {
        PetFood.availableFood = availableFood;
    }
}
