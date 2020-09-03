package com.bencef.farm.plants;

public abstract class Trait {
    private Plant plant;

    public Trait(Plant plant) {
        this.plant = plant;
    }

    public abstract TraitResult apply();
}
