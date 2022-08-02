package com.tarktech.training.beverage;

public class    CappuccinoMaker extends BeverageMaker {

    public String dispenseBeverage(){
        if(getAvailableBeverageCount()<=0){
            return "No more Cappuccino ";
        }
        updateBeverageQuantity();
        return "Enjoy a cup of Cappuccino with fresh!";
    }


}
