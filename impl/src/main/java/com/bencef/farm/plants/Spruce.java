package com.bencef.farm.plants;

import java.util.List;

public class Spruce extends Plant {

    public Spruce() {
        var shroomGrower = new ShroomGrower(this);
        var everGreen = new EverGreen(this);
        traits.addAll(List.of(shroomGrower, everGreen));
    }
}
