package org.example.ConcreateProduct;

import org.example.AbstractProduct.Laptop;

public class HighEndLaptop implements Laptop {
    @Override
    public String getSegment() {
        return "High-end laptop";
    }
}
