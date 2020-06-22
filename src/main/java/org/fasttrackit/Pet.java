package org.fasttrackit;

public class Pet {

    String name;
    String breed;
    String color;
    int age;
    double weight;
    float height;
    String favoriteFood;
    String favoriteActivity;
    int moralLevel = 5;
    int hungryLevel = 5;
    int healtLevel = 5;
    boolean isAlive;

    public Pet(){

    }

    public Pet(String name,String breed,String favoriteFood,String favoriteActivity){
        this.name = name;
        this.breed = breed;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
    }

    public void petMoral(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public int getMoralLevel() {
        return moralLevel;
    }

    public void setMoralLevel(int moralLevel) {
        this.moralLevel = moralLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public int getHealtLevel() {
        return healtLevel;
    }

    public void setHealtLevel(int healtLevel) {
        this.healtLevel = healtLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
