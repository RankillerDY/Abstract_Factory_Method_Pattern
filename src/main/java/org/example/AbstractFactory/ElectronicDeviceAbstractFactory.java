package org.example.AbstractFactory;

import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;

public abstract class ElectronicDeviceAbstractFactory {
    protected abstract Phone getPhone(Phone phone);
    protected abstract Laptop getLaptop(Laptop laptop);
}
