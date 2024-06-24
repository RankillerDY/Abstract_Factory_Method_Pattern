package org.example;

import org.example.AbstractFactory.ElectronicDeviceAbstractFactory;
import org.example.AbstractProduct.Laptop;
import org.example.AbstractProduct.Phone;
import org.example.Enums.Segment;
import org.example.Factory.ElectronicDeviceFactory;

public class Client {
    public static void main(String[] args) {
        ElectronicDeviceAbstractFactory factoryMidRange = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        Phone midRangePhone = factoryMidRange.getPhone();
        System.out.println(midRangePhone.getSegment());

        Laptop laptopMidRange = factoryMidRange.getLaptop();
        System.out.println(laptopMidRange.getSegment());
        System.out.println("===========================================");
        ElectronicDeviceAbstractFactory factoryHighEnd = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
        Phone phoneHighEnd = factoryHighEnd.getPhone();
        System.out.println(phoneHighEnd.getSegment());
        Laptop laptopHighEnd = factoryHighEnd.getLaptop();
        System.out.println(laptopHighEnd.getSegment());
    }
}
