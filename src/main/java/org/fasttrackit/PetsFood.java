package org.fasttrackit;

import java.time.LocalDateTime;

public class PetsFood {

    public PetsFood(String name){
        this.name = name;
    }
    String name;
    String flavor;
    int quantity;
    int availableQuantity;
    double price;
    LocalDateTime expireDate;

}
