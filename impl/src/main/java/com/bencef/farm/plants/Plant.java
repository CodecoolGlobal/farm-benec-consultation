package com.bencef.farm.plants;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public abstract class Plant {
    private int totalProduce;
    protected int monthlyProduce;  // protected so traits can access
    protected final List<Trait> traits = new ArrayList<>();


    public void growFood() {
        for (Trait trait : traits) {
            var result = trait.apply();
            if (result == TraitResult.ABORT) {
                throw new RuntimeException("Oh boi!! We is rottin!");
            }
        }
        totalProduce += monthlyProduce; // TODO: this might be too early (rotting)
    }
}
