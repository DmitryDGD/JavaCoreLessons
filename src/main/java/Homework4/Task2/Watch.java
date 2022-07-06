package Homework4.Task2;

public class Watch {
    private boolean isBroken;

    public void tick() throws WatchBrokenError {
        if (isBroken) {
            throw new WatchBrokenError("Часы сломались");
        }
        System.out.println("Часы тикают");
    }


    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }
}
