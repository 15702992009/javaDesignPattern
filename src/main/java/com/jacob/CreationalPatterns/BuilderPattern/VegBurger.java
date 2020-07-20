package com.jacob.CreationalPatterns.BuilderPattern;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 20;
    }
}
