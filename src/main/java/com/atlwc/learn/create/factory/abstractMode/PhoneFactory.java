package com.atlwc.learn.create.factory.abstractMode;

import com.atlwc.learn.create.factory.abstractMode.origin.phone.HuaWeiPhone;
import com.atlwc.learn.create.factory.abstractMode.origin.phone.Iphone;
import com.atlwc.learn.create.factory.abstractMode.origin.phone.Phone;
import com.atlwc.learn.create.factory.abstractMode.origin.phone.XiaoMiPhone;

/**
 * Created by lwc on 2020/8/16.
 */
public class PhoneFactory{

    protected Phone getPhone(String name) {
        if (name != null && !"".equals(name)){
            if (name.equals("iphone")){
                return new Iphone();
            } else if(name.equals("huawei")){
                return new HuaWeiPhone();
            } else if (name.equals("xiaomi")){
                return new XiaoMiPhone();
            }
        }
        return null;
    }
}
