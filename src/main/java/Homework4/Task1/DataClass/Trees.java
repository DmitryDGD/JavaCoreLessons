package Homework4.Task1.DataClass;

public abstract class Trees implements Smelling {
    String name;

    public Trees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hasCones() {
        System.out.println("Имеет шишки");
    }


}
