package Homework4.Task1;

import Homework4.Task1.DataClass.Trees;

public class Spruce extends Trees {


    public Spruce(String name) {
        super(name);
    }



    @Override
    public void doSmell(String name) {
        System.out.println(name + ": " + "умеет пахнуть");
    }
}
