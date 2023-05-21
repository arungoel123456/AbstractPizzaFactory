package com.demo.factory;

import java.util.*;

public class PizzaFactory {
    public Pizza createPizza(String type)
    {
        Pizza pizza= null;
        if(type.equalsIgnoreCase("new york margherita")){
            pizza= new NYMargherita();
            pizza.setVeggies(null);
            pizza.setCheese("goat cheese");
            pizza.prepare();
            pizza.bake(180);
        }
        else if(type.equalsIgnoreCase("new york farmhouse")){
            pizza= new NYFarmhouse();
            List<String> veggies= new ArrayList<>();
            veggies.add("olives");
            veggies.add("mushroom");
            veggies.add("tomato");
            veggies.add("pepperoni");
            pizza.setVeggies(veggies);
            pizza.setCheese("goat cheese");
            pizza.prepare();
            pizza.bake(180);
        }
        else if(type.equalsIgnoreCase("chicago farmhouse")) {

            pizza= new ChicagoFarmhouse();
            List<String> veggies= new ArrayList<>();
            veggies= new ArrayList<>();
            veggies.add("olives");
            veggies.add("mushroom");
            veggies.add("spinach");
            veggies.add("paneer");
            pizza.setVeggies(veggies);
            pizza.setCheese("mozarella cheese");
            pizza.prepare();
            pizza.bake(200);

        }
        else if(type.equalsIgnoreCase("chicago margherita")){
            pizza= new ChicagoMargherita();
            pizza.setVeggies(null);
            pizza.setCheese("mozarella cheese");
            pizza.prepare();
            pizza.bake(200);
        }
        return pizza;
    }

}
