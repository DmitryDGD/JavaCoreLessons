package Homework4.Task1.DataClass;

public abstract class Plants implements Smelling, Blooming {

    String name;

    public Plants(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
