package com.atlwc.learn.create.factory.abstractMode;


import static com.atlwc.learn.create.factory.abstractMode.ElectronEnum.*;

/**
 * Created by lwc on 2020/8/16.
 */
public class ElectronProducer extends AbstractElectronFactory {


    @Override
    protected Electron getElectronProduce(ElectronEnum type, String name) {
        if (name != null && !"".equals(name)){
            switch (type){
                case PHONE:
                    PhoneFactory phoneFactory = new PhoneFactory();
                    return phoneFactory.getPhone(name);
                case COMPUTER:
                    ComputerFactory computerFactory = new ComputerFactory();
                    return computerFactory.getComputer(name);
            }
        }
        return null;
    }
}
