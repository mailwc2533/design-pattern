package com.atlwc.learn.create.factory.simple;

/**
 * Created by lwc on 2020/8/16.
 */
public class PiazzFactoty {

    public static void main(String[] args) {
        ProductPizza pizza = new LondonProductPizza();
        Pizza cheese = pizza.createPizza("cheese");
        System.out.println(cheese.getClass());
    }
}
