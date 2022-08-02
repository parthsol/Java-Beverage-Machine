package com.tarktech.training.beverage;

public abstract class BeverageMaker {
    private int availableBeverageCount;
    private int dispensedBeverageCount;

    public BeverageMaker(){
        availableBeverageCount = 5;
        dispensedBeverageCount = 0;
    }

    protected void updateBeverageQuantity(){
        dispensedBeverageCount++;
        availableBeverageCount--;
    }

    public int getDispensedBeverageCount(){
        return dispensedBeverageCount;
    }

    public int getAvailableBeverageCount(){
        return availableBeverageCount;
    }

    public abstract String dispenseBeverage();

}
