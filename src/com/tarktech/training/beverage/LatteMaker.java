package com.tarktech.training.beverage;

public class LatteMaker extends  BeverageMaker{


    public String dispenseBeverage(){
        if(getAvailableBeverageCount() <= 0){
            return "No More Latte Available";
        }
        updateBeverageQuantity();
        return "Enjoy a cup of Latte with fresh creamy milk!";
    }

}
