package Homework4.Task1.DataClass;

import Homework4.Task1.Pine;

public abstract class Trees implements Smelling {
    String name;
    boolean hasCones;

    public Trees(boolean hasCones) {
        this.hasCones = hasCones;
    }

    public boolean isHasCones() {
        return hasCones;
    }
    public void setHasCones(boolean hasCones) {
        this.hasCones = hasCones;
    }

    public Trees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




}
