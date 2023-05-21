import com.demo.abstractFactory.*;

public class Main {
    public static void main(String[] args) {
        PizzaFactoryProducer pizzaFactoryProducer= new PizzaFactoryProducer();
        AbstractPizzaFactory nyFactory= pizzaFactoryProducer.getPizzaFactory("new york");
        nyFactory.createPizza("new york farmhouse");

    }
}