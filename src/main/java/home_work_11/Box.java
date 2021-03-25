package home_work_11;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    
    private ArrayList<T> fruits = new ArrayList<>();

    @SafeVarargs
    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    @SafeVarargs
    public final void addFruit(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    @SafeVarargs
    public final void deleteFruit(T... fruits){
        for( T fruit: fruits) this.fruits.remove(fruit);
    }

    public void deleteAll() {
        fruits.clear();
    }

    public float getWeight() {
        float weight = 0.0f;
        if (fruits.size() != 0.0f) {
            for (T fruit : fruits) {
                weight += fruit.getWeight();
            }
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;

    }

    public void transfer(Box<T> box) {
        box.fruits.addAll(this.fruits);
        deleteAll();
    }
}
