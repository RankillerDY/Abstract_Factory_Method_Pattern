package org.example.ConcreateProduct;

import org.example.AbstractProduct.Laptop;

public class MidRangeLaptop implements Laptop {
    @Override
    public String getSegment() {
        return "Mid-range laptop";
    }
}
