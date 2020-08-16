package com.atlwc.learn.create.singleton;

/**
 * Created by lwc on 2020/8/16.
 */
public class LazySingleton {

    /**
     * 懒汉模式（线程不安全）
     */
    private static LazySingleton instance = null;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
