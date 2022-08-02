package com.tarktech.training.beverage;


public class BeverageMachine {
    private  BeverageMaker[] beverageMakers = new BeverageMaker[4];

//
//    public BeverageMachine(int,int) {
//        beverageMakers[0] = new TeaMaker();
//        beverageMakers[1] = new LatteMaker();
//        beverageMakers[2] = new CappuccinoMaker();
//        beverageMakers[3] = new MochaMaker();
//    }



    public String dispenseBeverage(BeverageType beverageType) {
        int index = beverageType.ordinal();
        return beverageMakers[index].dispenseBeverage();
    }
    public int getDispensedBeverageCount(BeverageType beverageType) {
        int index = beverageType.ordinal();
        return beverageMakers[index].getDispensedBeverageCount();
    }

    public int getAvailableBeverageCount(BeverageType beverageType) {
        int index = beverageType.ordinal();
        return beverageMakers[index].getAvailableBeverageCount();
    }

    /*public BeverageType getMostFavoriteBeverage(){
        if (dispensedTeaCount>=dispensedLatteCount
                && dispensedTeaCount>=dispensedCappuccinoCount
                && dispensedTeaCount>=dispensedMochaCount){
            return BeverageType.Tea;
        }
        if(dispensedLatteCount>=dispensedTeaCount
                && dispensedLatteCount>=dispensedCappuccinoCount
                && dispensedLatteCount>=dispensedMochaCount){
            return BeverageType.Latte;
        }
        if(dispensedCappuccinoCount>=dispensedLatteCount
                && dispensedCappuccinoCount>=dispensedTeaCount
                && dispensedCappuccinoCount>=dispensedMochaCount){
            return BeverageType.Cappuccino;
        }
        if(dispensedMochaCount>=dispensedLatteCount
                && dispensedMochaCount>=dispensedCappuccinoCount
                && dispensedMochaCount>=dispensedTeaCount){
            return BeverageType.Mocha;
        }
       return null;
    }*/
}
