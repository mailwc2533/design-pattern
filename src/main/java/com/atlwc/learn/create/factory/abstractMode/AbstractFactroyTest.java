package com.atlwc.learn.create.factory.abstractMode;

import com.atlwc.learn.create.factory.abstractMode.origin.computer.Computer;
import com.atlwc.learn.create.factory.abstractMode.origin.phone.Phone;

/**
 * Created by lwc on 2020/8/16.
 */
public class AbstractFactroyTest {

    public static void main(String[] args) {
        ElectronFactory factory = new ElectronProducer();

        Computer huawei = (Computer)factory.getComuter("huawei");
        System.out.println(huawei);
        Computer mac = (Computer)factory.getComuter("mac");
        System.out.println(mac);
        Computer lenovo = (Computer)factory.getComuter("lenovo");
        System.out.println(lenovo);

        Phone huaweiPhone = (Phone)factory.getPhone("huawei");
        System.out.println(huaweiPhone);
        Phone xiaomi = (Phone)factory.getPhone("xiaomi");
        System.out.println(xiaomi);
        Phone iphone = (Phone)factory.getPhone("iphone");
        System.out.println(iphone);

    }
}
