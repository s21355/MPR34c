package com.example.demo;

import java.util.List;

public class Sandwitch {
    private Integer id;
    private String name;
    private int baseCalories;
    private double basePrice;
    private List<Ingredients> ingredients;
    private SizeOfSandwitch size;

    public Sandwitch(){
    }

    public Sandwitch(Integer id, String name, Integer baseCalories, Double basePrice, List<Ingredients> ingredients, SizeOfSandwitch size) {
        this.id = id;
        this.name = name;
        this.baseCalories = baseCalories;
        this.basePrice = basePrice;
        this.ingredients = ingredients;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseCalories() {
        return baseCalories;
    }

    public void setBaseCalories(int baseCalories) {
        this.baseCalories = baseCalories;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public SizeOfSandwitch getSize() {
        return size;
    }

    public void setSize(SizeOfSandwitch size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sandwitch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseCalories=" + baseCalories +
                ", basePrice=" + basePrice +
                ", ingredients=" + ingredients +
                ", size=" + size +
                '}';
    }
}
