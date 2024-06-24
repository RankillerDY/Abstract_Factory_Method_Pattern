package org.example.ConcreateFactory;

import org.example.AbstractFactory.ElectronicDeviceAbstractFactory;
import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;
import org.example.ConcreateProduct.HighEndLaptop;
import org.example.ConcreateProduct.HighEndPhone;

public class HighEndFactory extends ElectronicDeviceAbstractFactory {
    @Override
    public Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    public Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
