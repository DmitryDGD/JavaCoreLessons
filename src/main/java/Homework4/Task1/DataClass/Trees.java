package Homework4.Task1.DataClass;

import Homework4.Task1.Pine;

public abstract class Trees implements Smelling {
    String name;
    boolean hasCones;

   public Trees(String name, boolean hasCones) {
        this.name = name;
        this.hasCones = hasCones;
    }

    public String getName() {
        return name;
    }
}
