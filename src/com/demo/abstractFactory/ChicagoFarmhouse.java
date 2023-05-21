package com.demo.abstractFactory;

import java.util.*;

public class ChicagoFarmhouse implements Pizza{

    private String cheese;
    private List<String> veggies;

    @Override
    public void prepare() {
        System.out.println("ChicagoFarmhouse pizza preparing");
    }

    @Override
    public void bake(int temp) {
        System.out.println("ChicagoFarmhouse pizza baking at "+ temp);
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setVeggies(List<String> veggies) {
        this.veggies = veggies;
    }

}
