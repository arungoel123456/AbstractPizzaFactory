package com.demo.abstractFactory;

import java.util.*;

public class NYFactory extends AbstractPizzaFactory{

    private List<String> veggies;
    private String cheese;
    public NYFactory(){
        veggies= new ArrayList<>();
        veggies.add("olives");
        veggies.add("mushroom");
        veggies.add("tomato");
        veggies.add("pepperoni");
        cheese= "goat cheese";
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type== "new york farmhouse"){
            pizza= new NYFarmhouse();
            pizza.setVeggies(veggies);
        }
        else if(type == "ney york margherita"){
            pizza= new NYMargherita();
            pizza.setVeggies(null);
        }

        pizza.setCheese(cheese);
        pizza.prepare();
        pizza.bake(180);
        return pizza;
    }
}
