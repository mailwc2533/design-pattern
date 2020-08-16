package com.atlwc.learn.create.builder;

/**
 * Created by lwc on 2020/8/16.
 */
public abstract class AbstractComputerBuilder {

    protected Computer computer;

    public Computer getComputer(){
        return computer;
    }

    public void buildComputer(){
        computer = new Computer();
        System.out.println("生成一台电脑");
    }

    protected abstract void buildMaster();
    protected abstract void buildScreen();
    protected abstract void buildKeyboard();
    protected abstract void buildMouse();
    protected abstract void buildAudio();
}
