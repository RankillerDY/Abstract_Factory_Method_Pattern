package org.example.Factory;

import org.example.AbstractFactory.ElectronicDeviceAbstractFactory;
import org.example.ConcreateFactory.HighEndFactory;
import org.example.ConcreateFactory.MidRangeFactory;
import org.example.Enums.Segment;

public class ElectronicDeviceFactory {
    public static ElectronicDeviceAbstractFactory getFactory(Segment segment) {
        switch(segment) {
            case MID_RANGE:
                return new MidRangeFactory();
            case HIGH_END:
                return new HighEndFactory();
            default:
                throw new UnsupportedOperationException("Device not available");
        }
    }
}
