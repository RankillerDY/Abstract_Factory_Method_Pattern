package org.example.ConcreateFactory;

import org.example.AbstractFactory.ElectronicDeviceAbstractFactory;
import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;
import org.example.ConcreateProduct.MidRangeLaptop;
import org.example.ConcreateProduct.MidRangePhone;

public class MidRangeFactory extends ElectronicDeviceAbstractFactory {

    @Override
    public Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    public Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
