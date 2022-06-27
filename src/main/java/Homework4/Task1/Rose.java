package Homework4.Task1;

import Homework4.Task1.DataClass.Plants;

public class Rose extends Plants {


    public Rose(String name) {
        super(name);
    }

    @Override
    public void doSmell(String name) {
        System.out.println(name + ": " + "умеет пахнуть");
    }
    @Override
    public void doBloom(String name) {
        System.out.println(name + ": " + "умеет цвести");
    }
}
