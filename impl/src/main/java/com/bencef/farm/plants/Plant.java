package com.bencef.farm.plants;

import java.util.List;
import java.util.ArrayList;

public abstract class Plant {
    protected int monthlyProduce;  // protected so traits can access
    private List<Trait> traits = new ArrayList<>();
    public void growFood() {}
}
