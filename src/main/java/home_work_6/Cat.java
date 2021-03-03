package home_work_6;

public class Cat extends Animal{

    private final int run_distance;
    private final int swim_distance;
    private static int catsCount;

    public Cat(String name, String color, int age){
        super(name, color, age);
        this.run_distance = 200;
        this.swim_distance = 0;
        catsCount++;
    }

    public Cat(String name){
        super(name);
        this.run_distance = 200;
        this.swim_distance = 0;
        catsCount++;
    }

    public void catsCount(){
        System.out.println("Количество котов: " + catsCount);
    }

    @Override
    public String toString() {
        return super.toString() + ", максимальная дистанция бега: " + run_distance + ", максимальная дистанция заплыва: "
                + swim_distance + " - кот не умеет плавать" ;
    }

    @Override
    public void run(int distance) {
        if(distance <= run_distance){
            System.out.println("Кот " + name + " пробежал дистанцию = " + distance + " метров");
        }
        else {
            System.out.println("Кот " + name + " хотел пробежать дистанцию = " + distance +
                    " метров, но он устал и пробежал свою максимальную дистанцию = " + run_distance + " метров" +
                    " оставшиеся " + (distance - run_distance) + " метров он пробежит позже");
        }
    }

    @Override
    public void swim() {
        System.out.println("Коты боятся воды. Они не умеют плавать.");
    }
}
