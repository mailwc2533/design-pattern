package com.atlwc.learn.create.factory.abstractMode;

/**
 * Created by lwc on 2020/8/16.
 */
public enum ElectronEnum {
    PHONE("phone"), COMPUTER("cpmputer");

    public String value;


    ElectronEnum(String value){
        this.value = value;
    };
}
