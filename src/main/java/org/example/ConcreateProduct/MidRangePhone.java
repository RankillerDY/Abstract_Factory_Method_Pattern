package org.example.ConcreateProduct;

import org.example.AbstractProduct.Phone;

public class MidRangePhone implements Phone {
    @Override
    public String getSegment() {
        return "Mid-range phone";
    }
}
