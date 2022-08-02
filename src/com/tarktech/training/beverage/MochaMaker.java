package com.tarktech.training.beverage;

public class MochaMaker extends  BeverageMaker{


    public String dispenseBeverage(){
        if(getAvailableBeverageCount()<=0){
            return "No more Mocha ";
        }
        updateBeverageQuantity();
        return "Enjoy a cup of Cappuccino with fresh!";
    }




}
