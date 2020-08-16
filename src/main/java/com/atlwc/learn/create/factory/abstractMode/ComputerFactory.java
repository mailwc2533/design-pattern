package com.atlwc.learn.create.factory.abstractMode;

import com.atlwc.learn.create.factory.abstractMode.origin.computer.Computer;
import com.atlwc.learn.create.factory.abstractMode.origin.computer.HuaWeiComputer;
import com.atlwc.learn.create.factory.abstractMode.origin.computer.Lenovo;
import com.atlwc.learn.create.factory.abstractMode.origin.computer.Mac;

/**
 * Created by lwc on 2020/8/16.
 */
public class ComputerFactory{

    protected Computer getComputer(String name) {
        if (!"".equals(name) && name != null){
            if (name.equals("mac")){
                return new Mac();
            } else if (name.equals("lenovo")){
                return new Lenovo();
            } else if (name.equals("huawei")){
                return new HuaWeiComputer();
            }
        }
        return null;
    }
}
