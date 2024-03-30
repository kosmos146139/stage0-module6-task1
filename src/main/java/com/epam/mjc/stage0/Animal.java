package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;

    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s = "This animal is mostly " + color + ". It has " + numberOfPaws;

        if (numberOfPaws > 1)
        {
            s+=" paws and ";
        }
        else{
            s+=" paw and ";
        }
        if (hasFur){
            s += "a fur.";
        }
        else {
            s += "no fur.";
        }
        return s;
    }
}
