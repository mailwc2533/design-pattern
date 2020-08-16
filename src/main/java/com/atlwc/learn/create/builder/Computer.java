package com.atlwc.learn.create.builder;

/**
 * Created by lwc on 2020/8/16.
 */
public class Computer {

    private String audio;
    private String keyBoard;
    private String master;
    private String mouse;
    private String screen;

    @Override
    public String toString() {
        return "Computer{" +
                "audio='" + audio + '\'' +
                ", keyBoard='" + keyBoard + '\'' +
                ", master='" + master + '\'' +
                ", mouse='" + mouse + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
