package com.bencef.farm.plants;

public class ShroomGrower extends Trait {
    public ShroomGrower(Plant plant) {
        super(plant);
    }

    @Override
    public TraitResult apply() {
        return TraitResult.ABORT;
    }
}
