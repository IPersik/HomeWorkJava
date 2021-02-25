package home_work_5;

public class Employee {
    String fullName;
    String position;
    String email;
    long phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, long phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        if(age < 18){
            System.err.println("Недопустимый возраст " + "у: " + fullName + ". Минималный возраст для работника - 18 лет" + '\n');
        }
    }

    void printInfoEmp(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя сотрудника: " + fullName + '\n' +
                "Должность: " + position + '\n' +
                "Email: " + email + ", " +
                "Номер телефона: " + phoneNumber + '\n' +
                "Зарплата: " + salary + '\n' +
                "Возраст: " + age + '\n';
    }
}
