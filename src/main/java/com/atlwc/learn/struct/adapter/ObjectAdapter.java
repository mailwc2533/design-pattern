package com.atlwc.learn.struct.adapter;

/**
 * Created by lwc on 2020/8/16.
 * 对象适配器（不能调用适配对象的方法）
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }

}

class ObjectTest{
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ObjectAdapter adapter = new ObjectAdapter(adaptee);
        adapter.request();
    }
}


