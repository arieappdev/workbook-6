package com.pluralsight;

import com.pluralsight.finance.FixedAsset;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(String name, double weight) {
        super(name, 0);

        this.weight = weight;
        //why do my constructors have things from fixed asset?
        //- pulled from the super class

    }

    @Override
    public double getValue() {
        return weight * 50;
    }
}

