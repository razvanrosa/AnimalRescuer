package org.fasttrackit;

import java.time.LocalDateTime;

public class PetFood {

    String name;
    double price;

    public PetFood(String name,double price){
        this.name = name;
        this.price = price;
    }
    String flavor;
    int quantity;
    int availableQuantity;
    LocalDateTime expireDate;

}
