package Homework4.Task1;

import Homework4.Task1.DataClass.Plants;


public class Fern extends Plants {


    public Fern(String name) {
        super(name);
    }

    @Override
    public void doBloom(String name) {
        System.out.println(name + ": " + "умеет цвести");
    }

    @Override
    public void doSmell(String name) {
        System.out.println(name + ": " + "умеет пахнуть");
    }
}
