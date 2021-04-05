package home_work_14;

import java.util.Arrays;

public class ArrayFour {

    public static int[] newArray(int[] startArray){

        for (int i = startArray.length-1; i >= 0; i--) {
            if (startArray[i] == 4) {
                int[] finalArray = new int[startArray.length -i -1];
                for (int j = i+1, k=0; j < startArray.length; j++, k++) {
                    finalArray[k] = startArray[j];
                }
                return finalArray;
            }
        }
        throw new RuntimeException("В массиве нет четверок");
    }

    public static boolean chekArray(int[] arr) {

        boolean onlyOne = false;
        boolean onlyFour = false;

        for (int i : arr) {
            if (i != 1 && i != 4) return false;
            if (i == 1) onlyOne = true;
            if (i == 4) onlyFour = true;
        }
        return onlyFour && onlyOne;
    }
}

