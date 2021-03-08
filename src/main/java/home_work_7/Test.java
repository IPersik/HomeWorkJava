package home_work_7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {
                new Cat("Толик", 4),
                new Cat("Вася", 4),
                new Cat("Лариса", 5),
                new Cat("Пушок", 8),
                new Cat("Снежок", 6),
                new Cat("Алиска", 7),
                new Cat("Сара", 1)
        };

        Scanner in = new Scanner(System.in);
        System.out.println("Положите в миску еду (укажите ее количество): " );
        Plate plate = new Plate(new Scanner(System.in).nextInt());


        for (Cat cat: cats) {  // работает таким образом, что коты едят по очереди. Очередь переходит к следующему, если кот поел или если ему не хватило единиц еды в миске для одного "укуса"
            while (!cat.isAteAndAsleep() && plate.getFood() >= cat.getAppetite()) {
                cat.eat(plate);
                plate.printInfo();
            }
            if (cat.isAteAndAsleep()) {
                System.out.printf("%s наелся\n", cat.getName());
            } else {
                System.out.printf("%s остался голодным, ему не хватило %d еды\n", cat.getName(), cat.getCatPlaceInTheStomach() - cat.getCatSatiety());

            }
        }
    }
}
