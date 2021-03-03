package home_work_6;

public abstract class Animal {
    protected String name;
    private String color;
    private int age;
    private static int animalsCount;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;

        animalsCount++;
        System.out.println("Количесвто животных: " + animalsCount);
    }

    public Animal(String name){
        this(name, "Серобуромальновый", 0);
    }

    public void animalsCount(){
        System.out.println("Количество животных: " + animalsCount);
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", цвет: " + color + ", возраст: " + age;
    }

    public abstract void run(int distance);
    public abstract void swim();
}
