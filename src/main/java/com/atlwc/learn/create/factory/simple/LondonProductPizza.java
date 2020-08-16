package com.atlwc.learn.create.factory.simple;

import com.atlwc.learn.create.factory.simple.origin.LodonCheessePizza;
import com.atlwc.learn.create.factory.simple.origin.LodonPepperPizza;

/**
 * Created by lwc on 2020/8/16.
 */
public class LondonProductPizza implements ProductPizza {

    public Pizza createPizza(String type) {
        if (type != null && !"".equals(type)){
            if (type.equals("cheese")){
                return new LodonCheessePizza();
            } else if (type.equals("pepper")){
                return new LodonPepperPizza();
            }
        }
        return null;
    }
}
