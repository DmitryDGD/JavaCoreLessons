package Homework4.Task2;

public class Main {

    public static void main(String[] args) {

        Watch watchBroken = new Watch(true);
        Watch watch = new Watch(false);
        Worker workerWithBrokenWatch = new Worker(watch);
        Worker workerWithWatch = new Worker(watchBroken);
        Worker[] workersForShop1 = {workerWithWatch};
        Worker[] workersForShop2 = {workerWithBrokenWatch};
        Shop shop1 = new Shop(workersForShop1);
        Shop shop2 = new Shop(workersForShop2);
        Shop[] shops = {shop1, shop2};
        Brand brand = new Brand(shops);

        for (Shop shop : brand.getShops()) {
            for (Worker shopWorker : shop.getWorkers()) {
                try {
                    shopWorker.getWatch().tick();
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }


        }


    }

}
