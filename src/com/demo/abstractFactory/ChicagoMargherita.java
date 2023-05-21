package com.demo.abstractFactory;

import java.util.*;

public class ChicagoMargherita implements Pizza{

    private String cheese;
    private List<String> veggies;

    @Override
    public void prepare() {
        System.out.println("ChicagoMargherita pizza preparing");
    }

    @Override
    public void bake(int temp) {
        System.out.println("ChicagoFarmhouse margherita baking at "+ temp);
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setVeggies(List<String> veggies) {
        this.veggies = veggies;
    }

}
