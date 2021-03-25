package home_work_11;

import java.util.ArrayList;
import java.util.Arrays;

public class FromArrayToList <T> {

    @SafeVarargs
    public FromArrayToList(T... arr){
    }

    public ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}