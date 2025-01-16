package org.example;

import java.sql.Date;
import java.util.List;

public class Bottele {
    private String tinctureName;
    private List ingredients;
    private Date filling;
    private double volume;


    Bottele(String tinctureName, List ingredients, Date filling, double volume) {
        this.tinctureName = tinctureName;
        this.ingredients = ingredients;
        this.filling = filling;
        this.volume = volume;
    }

    public String getTinctureName() {
        return tinctureName;
    }

    public List getIngredients() {
        return ingredients;
    }
    public Date getFilling() {
        return filling;
    }

    public double getVolume() {
        return volume;
    }
}
