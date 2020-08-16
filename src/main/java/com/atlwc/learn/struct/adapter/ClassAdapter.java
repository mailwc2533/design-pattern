package com.atlwc.learn.struct.adapter;

/**
 * Created by lwc on 2020/8/16.
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target{

    public void request() {
        specificRequest();
    }
}

interface Target{
    void request();
}

class Adaptee{
    public void specificRequest(){
        System.out.println("适配");
    }
}

class ClassAdapterTest{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ClassAdapter classAdapter = ClassAdapter.class.newInstance();
        classAdapter.request();

    }
}


