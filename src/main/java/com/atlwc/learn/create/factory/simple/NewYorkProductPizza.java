package com.atlwc.learn.create.factory.simple;

import com.atlwc.learn.create.factory.simple.origin.NewYorkCheessePizza;
import com.atlwc.learn.create.factory.simple.origin.NeyYorkPepperPizza;

/**
 * Created by lwc on 2020/8/16.
 */
public class NewYorkProductPizza implements ProductPizza {

    public Pizza createPizza(String type) {
        if (type != null && "".equals(type)){
            if (type.equals("cheese")){
                return new NewYorkCheessePizza();
            } else if (type.equals("pepper")){
                return new NeyYorkPepperPizza();
            }
        }
        return null;
    }
}
