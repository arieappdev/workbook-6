package com.pluralsight.finance;

import com.pluralsight.Valuable;


public abstract class FixedAsset implements Valuable {

    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        //i think value is supposed to go above and not marketValue
        this.name = name;
        this.marketValue = marketValue;

    }

    @Override
    public double getValue() {
        return marketValue;

        //do i return value or market value?
    }

}
