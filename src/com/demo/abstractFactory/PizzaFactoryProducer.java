package com.demo.abstractFactory;

public class PizzaFactoryProducer {
    public AbstractPizzaFactory getPizzaFactory(String type){
        if(type == "new york"){
            return new NYFactory();
        }
        else if (type == "chicago") {
            return new ChicagoFactory();
        }
        else {
            return null;
        }
    }
}
