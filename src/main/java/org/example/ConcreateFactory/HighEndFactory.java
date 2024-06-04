package org.example.ConcreateFactory;

import org.example.AbstractFactory.ElectronicDeviceAbstractFactory;
import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;
import org.example.ConcreateProduct.HighEndLaptop;
import org.example.ConcreateProduct.HighEndPhone;

public class HighEndFactory extends ElectronicDeviceAbstractFactory {
    @Override
    protected Phone getPhone(Phone phone) {
        return new HighEndPhone();
    }

    @Override
    protected Laptop getLaptop(Laptop laptop) {
        return new HighEndLaptop();
    }
}
