package home_work_11;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Integer[] array = {1, 2, 3, 4, 5};

        ChangeOfPlaces<Integer> changeOfPlaces = new ChangeOfPlaces<>();
        System.out.println(Arrays.toString(changeOfPlaces.changeOfPlace(array, 2, 3)));

        System.out.println("Задание 2");

        FromArrayToList<Integer> fromArrayToList = new FromArrayToList<Integer>();
        fromArrayToList.toArrayList(array);

        System.out.println("Задание 3");
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Orange orange = new Orange();
        Orange orange1 = new Orange();

        Box<Apple> appleBox = new Box<>(apple, apple1);
        Box<Orange> orangeBox = new Box<>(orange, orange1);
        Box<Orange> orangeBox1 = new Box<>();

        System.out.println(appleBox.compare(orangeBox));
        orangeBox.transfer(orangeBox1);
        System.out.println(orangeBox1.getWeight());
    }
}
