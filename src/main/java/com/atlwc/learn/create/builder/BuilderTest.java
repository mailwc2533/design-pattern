package com.atlwc.learn.create.builder;

/**
 * Created by lwc on 2020/8/16.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();

        director.setComputerBuilder(new HuaWeiComputer());
        director.constructComputer();

        director.setComputerBuilder(new HPComputerBuilder());
        director.constructComputer();

        System.out.println(director.getComputer());
    }
}
