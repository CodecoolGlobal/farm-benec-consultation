package com.bencef.farm.plants;

public abstract class Trait {
    protected Plant plant;

    public Trait(Plant plant) {
        this.plant = plant;
    }

    public abstract TraitResult apply();
}
