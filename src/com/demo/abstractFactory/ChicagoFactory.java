package com.demo.abstractFactory;

import java.util.*;

public class ChicagoFactory extends AbstractPizzaFactory{
    private List<String> veggies;
    private String cheese;
    public ChicagoFactory(){
        veggies= new ArrayList<>();
        veggies.add("olives");
        veggies.add("mushroom");
        veggies.add("spinach");
        veggies.add("paneer");
        cheese= "mozarella cheese";
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type== "chicago farmhouse"){
            pizza= new ChicagoFarmhouse();
            pizza.setVeggies(veggies);
        }
        else if(type == "chicago margherita"){
            pizza= new ChicagoMargherita();
            pizza.setVeggies(null);
        }

        pizza.setCheese(cheese);
        pizza.prepare();
        pizza.bake(200);
        return pizza;
    }
}
