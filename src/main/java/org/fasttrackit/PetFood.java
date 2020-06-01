package org.fasttrackit;

import java.time.LocalDateTime;

public class PetFood {

    public PetFood(String name){
        this.name = name;
    }
    String name;
    String flavor;
    int quantity;
    int availableQuantity;
    double price;
    LocalDateTime expireDate;

}
