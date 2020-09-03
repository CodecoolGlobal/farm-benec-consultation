package com.bencef.farm.plants;


public class EverGreen extends Trait {
    int monthsUntilGrowth = 5;

    public EverGreen(Plant plant) {
        super(plant);
    }

    @Override
    public TraitResult apply() {
        if (monthsUntilGrowth == 0) {
            plant.monthlyProduce += 8;
            monthsUntilGrowth = 5;
        }
        monthsUntilGrowth--;
        plant.monthlyProduce = Math.min(plant.monthlyProduce, 80);
        return TraitResult.CONTINUE;
    }
}
