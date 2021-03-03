package home_work_6;

public class Main {
    public static void main (String[] args){

        Cat cat1 = new Cat("Пушок", "серый", 1);
        Cat cat2 = new Cat("Рыжик");

        Dog dog1 = new Dog("Боб");
        Dog dog2 = new Dog("Тимми", "рыжий", 4);

        cat1.catsCount(); // вместо обращения к функции, можно делать автоатический вывод количества созданнх животных, как у класса Animals, но так будет довольно грязно
        dog1.dogsCount();
    }
}
