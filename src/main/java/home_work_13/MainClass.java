package home_work_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.*;

public class MainClass {

    public static final int CARS_COUNT = 4;

    static CountDownLatch cdlStart = new CountDownLatch(CARS_COUNT);
    static CountDownLatch cdlFinish = new CountDownLatch(CARS_COUNT);
    static CyclicBarrier cb = new CyclicBarrier(CARS_COUNT);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (Car car : cars) {
            new Thread(car).start();
        }
        cdlStart.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        cdlFinish.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

class Car implements Runnable {

    private static int CARS_COUNT;
    private final Race race;
    private final int speed;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        CyclicBarrier cyclicBarrier = MainClass.cb;
        CountDownLatch cdlFinish = MainClass.cdlFinish;
        CountDownLatch cdlStart = MainClass.cdlStart;
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            cdlStart.countDown();
            System.out.println(this.name + " готов");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }finally {
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
        }
        cdlFinish.countDown();
    }
}

abstract class Stage {

    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}
class Road extends Stage {

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " закончил этап: " + description);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    Semaphore semaphore = new Semaphore(MainClass.CARS_COUNT/2);
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
            semaphore.acquire();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(c.getName() + " закончил этап: " + description);
            semaphore.release();
        }
    }
}

class Race {
    private final ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}

