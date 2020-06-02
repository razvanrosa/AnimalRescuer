package org.fasttrackit;

import java.time.LocalDateTime;

public class PetFood {

    public PetFood(String name,double price){
        this.name = name;
        this.price = price;
    }
    String name;
    String flavor;
    int quantity;
    int availableQuantity;
    double price;
    LocalDateTime expireDate;

}
