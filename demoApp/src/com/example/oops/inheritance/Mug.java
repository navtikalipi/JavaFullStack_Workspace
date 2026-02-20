package com.example.oops.inheritance;

public class Mug {
    public void addLiquid(Liquid l){
        System.out.println("Adding liquid to the mug");
        l.swirl();
        if(l instanceof Coffee)
            System.out.println("Swirling coffee");
        else if(l instanceof Tea)
            System.out.println("Swirling tea");
        else
            System.out.println("General liquid");
    }

    public void addJuice(Juice j){
        j.swirl();
    }
}
