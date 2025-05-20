package com.pluralsight;

import com.pluralsight.finance.FixedAsset;

public class House extends FixedAsset {


    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet. int bedrooms ) {
        super(name, 0);

        this.yearBuilt = yearBuilt;
        this.sqareFeet = squareFeet;
        this.bedrooms = bedrooms;
        //do I need these? YES

        @Override
        public double getMarketValue;
        return yearBuilt, squareFeet, bedrooms;

        //value or market value?
    }

}
