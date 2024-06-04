package org.example.ConcreateFactory;

import org.example.AbstractFactory.ElectronicDeviceAbstractFactory;
import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;
import org.example.ConcreateProduct.MidRangeLaptop;
import org.example.ConcreateProduct.MidRangePhone;

public class MidRangeFactory extends ElectronicDeviceAbstractFactory {

    @Override
    protected Phone getPhone(Phone phone) {
        return new MidRangePhone();
    }

    @Override
    protected Laptop getLaptop(Laptop laptop) {
        return new MidRangeLaptop();
    }
}
