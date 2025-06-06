package com.pluralsight.finance;

import com.pluralsight.finance.FixedAsset;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double karat) {
        super(name, 0);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat * 100;
    }
}
