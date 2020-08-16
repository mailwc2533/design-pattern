package com.atlwc.learn.struct.adapter;

/**
 * Created by lwc on 2020/8/16.
 * 接口适配器
 */
public class InterfaceAdapter implements Target1, Target2{
    public void method1() {
        Target1 target1 = new Target1Impl();
        target1.method1();
    }

    public void method2() {
        Target2 target2 = new Target2Impl();
        target2.method2();
    }
}

interface Target1{
    void method1();
}

interface Target2{
    void method2();
}

class Target1Impl implements Target1{
    public void method1() {
        System.out.println("method1");
    }
}

class Target2Impl implements Target2{
    public void method2() {
        System.out.println("method2");
    }
}

class InterfaceAdapterTest{
    public static void main(String[] args) {
        InterfaceAdapter adapter = new InterfaceAdapter();
        adapter.method1();
        adapter.method2();
    }
}