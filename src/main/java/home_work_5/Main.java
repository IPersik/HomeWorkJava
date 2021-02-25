package home_work_5;

public class Main {
    public static void main (String[] args){

        Employee[] emp = {
                new Employee("Иванов Иван Иванович", "повар", "Ivan11@mail.ru",
                        89112233449L, 24000, 20),
                new Employee("Иванова Мария Алексеевна", "няня", "нет",
                        89112233445L, 28000, 17),
                new Employee("Петров Петр Петрович", "садовник", "PetrPP@mail.ru",
                        89999911991L, 25000, 45),
                new Employee("Кузнеуова Полина Петрова", "смотриетль", "polinaKuz@gmail.com",
                        89934433839L, 30000, 41),
                new Employee("Егоров Егор Егорович", "водтель", "нет",
                        891122458305L, 24000, 50),
        };

        for (Employee e : emp){
            if(e.age>40) System.out.println(e);
        }
    }
}
