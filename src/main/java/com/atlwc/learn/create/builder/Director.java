package com.atlwc.learn.create.builder;

/**
 * Created by lwc on 2020/8/16.
 * 组装Computer
 */
public class Director {

    private AbstractComputerBuilder builder;

    public void setComputerBuilder(AbstractComputerBuilder builder){
        this.builder = builder;
    }

    public Computer getComputer(){
        return builder.getComputer();
    }

    public void constructComputer(){
        builder.buildComputer();
        builder.buildAudio();
        builder.buildKeyboard();
        builder.buildMaster();
        builder.buildMouse();
        builder.buildScreen();
    }
}
