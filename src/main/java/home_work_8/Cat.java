package home_work_8;

public class Cat implements Party, Jump, Run{

    private String name;
    private int maxDistance;
    private int maxHeight;

    public Cat(String name, int maxDistance, int maxHeight){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");

    }

    @Override
    public String getName() {
        return name;
    }
}
