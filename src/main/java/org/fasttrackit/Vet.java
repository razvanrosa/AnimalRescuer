package org.fasttrackit;

import java.util.Scanner;

public class Vet {

    String name;
    String specialization;

    public  Vet(){

    }

    public Vet(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public static void initVet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vet name and specialiation!");
        Vet vet = new Vet(scanner.next(),scanner.next());
    }

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

}
