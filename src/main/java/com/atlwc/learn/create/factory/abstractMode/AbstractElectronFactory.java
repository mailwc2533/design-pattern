package com.atlwc.learn.create.factory.abstractMode;

import com.atlwc.learn.create.factory.abstractMode.origin.computer.Computer;
import com.atlwc.learn.create.factory.abstractMode.origin.phone.Phone;

/**
 * Created by lwc on 2020/8/16.
 */
public abstract class AbstractElectronFactory implements ElectronFactory{

    public Electron getPhone(String name) {
        return getElectronProduce(ElectronEnum.PHONE, name);
    }

    public Electron getComuter(String name) {
        return getElectronProduce(ElectronEnum.COMPUTER, name);
    }

    abstract protected Electron getElectronProduce(ElectronEnum type, String name);
}
