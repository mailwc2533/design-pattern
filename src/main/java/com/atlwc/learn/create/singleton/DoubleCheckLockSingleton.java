package com.atlwc.learn.create.singleton;

/**
 * Created by lwc on 2020/8/16.
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton(){}

    public DoubleCheckLockSingleton getInstance(){
        if (instance == null){
            synchronized (this){
                if (instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
