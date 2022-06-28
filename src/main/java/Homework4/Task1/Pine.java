package Homework4.Task1;

import Homework4.Task1.DataClass.Trees;

public class Pine extends Trees {

    public Pine(String name, boolean hasCones) {
        super(name, hasCones);
    }

    @Override
    public void doSmell(String name) {
        System.out.println(name + ": " + "умеет пахнуть");
    }
}
