package com.tarktech.training.beverage;

public class TeaMaker extends BeverageMaker{


    public String dispenseBeverage(){
        if(getAvailableBeverageCount()<=0){
            return "No More Tea Available";
        }
        updateBeverageQuantity();
        return "Enjoy your Hot Masala Tea!";
    }




}
