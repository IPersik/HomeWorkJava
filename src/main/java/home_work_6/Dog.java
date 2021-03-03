package home_work_6;

import java.util.Random;

public class Dog extends Animal {
    private final int run_distance;
    private final int swim_distance;
    private static int dogsCount;

    public Dog(String name, String color, int age){
        super(name, color, age);
        this.run_distance = 500;
        this.swim_distance = 10;
        dogsCount++;
    }

    public Dog(String name){
        super(name);
        this.run_distance = 500;
        this.swim_distance = 10;
        dogsCount++;
    }

    public void dogsCount(){
        System.out.println("Количество собак: " + dogsCount);
    }

    @Override
    public String toString() {
        return super.toString() + ", максимальная дистанция бега: " + run_distance + ", максимальная дистанция заплыва: "
                + swim_distance ;
    }

    @Override
    public void run(int distance) {
        if(distance <= run_distance){
            System.out.println("Пёс " + name + " пробежал дистанцию = " + distance + " метров");
        }
        else {
            System.out.println("Пес " + name + " хотел пробежать дистанцию = " + distance +
                    " метров, но он устал и пробежал свою максимальную дистанцию = " + run_distance + " метров" +
                    " оставшиеся " + (distance - run_distance) + " метров он пробежит позже");
        }
    }

    @Override
    public void swim() {
        int distance = new Random().nextInt(10) + 1;
        System.out.println("Пёс " + name + " пропыл дистанцию = " + distance);
    }
}
