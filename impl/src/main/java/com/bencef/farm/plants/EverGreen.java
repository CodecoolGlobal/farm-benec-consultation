package com.bencef.farm.plants;


public class EverGreen extends Trait {
    public EverGreen(Plant plant) {
        super(plant);
    }

    @Override
    public TraitResult apply() {
        return TraitResult.ABORT;
    }
}
