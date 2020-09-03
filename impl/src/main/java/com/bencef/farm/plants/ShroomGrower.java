package com.bencef.farm.plants;

import java.util.Random;

public class ShroomGrower extends Trait {
    private final int shroomGrowChance;
    private final int productionIncrease;
    private final int rotChance;
    private final int productionDecrease;

    private final Random random = new Random();

    public ShroomGrower(Plant plant,
                        int shroomGrowChance,
                        int productionIncrease,
                        int rotChance,
                        int productionDecrease) {
        super(plant);
        this.shroomGrowChance = shroomGrowChance;
        this.productionIncrease = productionIncrease;
        this.rotChance = rotChance;
        this.productionDecrease = productionDecrease;
    }

    @Override
    public TraitResult apply() {
        if (chanceHappens(shroomGrowChance)) {
            plant.monthlyProduce += productionIncrease;
        }
        if (chanceHappens(rotChance)) {
            plant.monthlyProduce -= productionDecrease;
            return TraitResult.ABORT;
        }
        return TraitResult.CONTINUE;
    }

    private boolean chanceHappens(int percent) {
        int rn = random.nextInt(101);
        return percent < rn;
    }
}
