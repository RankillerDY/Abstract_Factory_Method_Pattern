package org.example.ConcreateProduct;

import org.example.AbstractProduct.Phone;

public class HighEndPhone implements Phone {
    @Override
    public String getSegment() {
        return "High-end phone";
    }
}
