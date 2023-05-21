package com.demo.factory;

import java.util.*;

public interface Pizza {
    public void prepare();
    public void bake(int temp);
    public void setCheese(String cheese);
    public void setVeggies(List<String> veggies);
}
