package org.fasttrackit;

public class Vet {

    String name;
    String specialization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Vet(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

}
