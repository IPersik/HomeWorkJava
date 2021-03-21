package home_work_10;

import java.util.*;
import java.util.function.Function;

public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList("яблоко", "яблоко", "груша", "апельсин", "киви", "банан", "киви", "мандарин", "мандарин", "яблоко",
                "лимон", "киви", "яблоко"));

        System.out.println(fruitList(fruitsList));
        System.out.println(fruitMap(fruitsList));
    }

    private static ArrayList<String> fruitList(ArrayList<String> fruitsList){;

        ArrayList<String> fruitsUnique = new ArrayList<>(10);
        var fruitsMap = fruitMap(fruitsList);
        for(Map.Entry<String, Integer> entry : fruitsMap.entrySet()){
            if(entry.getValue() == 1){
                fruitsUnique.add(entry.getKey());
            }
        }
        return fruitsUnique;
    }

    private static Map<String, Integer> fruitMap(ArrayList<String> fruitsList){
        Map<String, Integer> fruitsMap = new HashMap<>();
        for (String fruit : fruitsList) {
            int count = fruitsMap.getOrDefault(fruit, 0) + 1;
            fruitsMap.put(fruit, count);
        }

        return fruitsMap;
    }
}

