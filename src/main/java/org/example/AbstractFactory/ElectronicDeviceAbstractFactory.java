package org.example.AbstractFactory;

import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;

public abstract class ElectronicDeviceAbstractFactory {
    public abstract Phone getPhone();
    public abstract Laptop getLaptop();

}
