package home_work_10;

import java.util.*;

public class Phonebook {

    private static final HashMap<Integer, String> phonebook = new HashMap<>();

    public static void main(String[] args) {
        add("lui", 9);
        add("lui", 0);
        add("pop", 9);
        add("lop", 8);
        get("lui");
    }

    public static void add(String surname, int number){
        if(phonebook.containsKey(number)){
            if(phonebook.containsValue(surname)){
                phonebook.put(number, surname);
                System.out.printf("В телефонную книгу добавлен номер %s к фамилии %s%n", number, surname);
            } else {
                System.out.printf("номер телефона %s пренадлежит другому человеку %n", number);
            }
        } else {
            phonebook.put(number, surname);
            System.out.printf("В телефонную книгу добавлен номер %s и фамилия %s%n", number, surname);
        }
    }

    public static void get(String name) {
        LinkedList<Integer> book = new LinkedList<>();
        for(Map.Entry<Integer, String> entry: phonebook.entrySet()){
            if(entry.getValue().equals(name)){
                book.add(entry.getKey());
            }
        }
        System.out.printf("По фамиллии %s найдены номера: %s%n", name, book);
    }
}
