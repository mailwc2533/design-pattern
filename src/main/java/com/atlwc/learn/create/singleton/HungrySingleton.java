package com.atlwc.learn.create.singleton;

/**
 * Created by lwc on 2020/8/16.
 */
public class HungrySingleton {

    /**
     * 饿汉模式（线程安全）
     * 生命周期随着程序的启动和消亡，资源消耗大
     */
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
