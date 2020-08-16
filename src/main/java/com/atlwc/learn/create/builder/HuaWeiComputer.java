package com.atlwc.learn.create.builder;

/**
 * Created by lwc on 2020/8/16.
 */
public class HuaWeiComputer extends AbstractComputerBuilder {

    @Override
    protected void buildMaster() {
        computer.setMaster("i7,16g,512SSD,1060");
    }

    @Override
    protected void buildScreen() {
        computer.setScreen("1080p");
    }

    @Override
    protected void buildKeyboard() {
        computer.setKeyBoard("cherry 青轴机械键盘");
    }

    @Override
    protected void buildMouse() {
        computer.setMouse("MI 鼠标");
    }

    @Override
    protected void buildAudio() {
        computer.setAudio("飞利浦 音响");
    }
}
