package com.atlwc.learn.create.factory.abstractMode;

import com.atlwc.learn.create.factory.abstractMode.origin.computer.Computer;
import com.atlwc.learn.create.factory.abstractMode.origin.phone.Phone;

/**
 * Created by lwc on 2020/8/16.
 */
public interface ElectronFactory {

    Electron getPhone(String name);
    Electron getComuter(String name);
}
