package home_work_12;

import java.util.Arrays;

public class Multithreading {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        Object o = new Object();
        oneStream();
        twoStreams();
    }

    public static void oneStream(){
        float[] arr = new float[SIZE];
        fillingArr(arr);
        long a = System.currentTimeMillis();
        calcValue(arr);
        System.out.println("Однопоточное выполнение: " + (System.currentTimeMillis() - a));
    }

    public static void twoStreams(){
        float[] arr = new float[SIZE];
        float[] b = new float[HALF];
        float[] c = new float[HALF];

        fillingArr(arr);

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, b, 0, HALF);
        System.arraycopy(arr, HALF, c, 0, HALF);

        Thread thread1 = new Thread(() -> calcValue(b));
        Thread thread2 = new Thread(() -> calcValue(c));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(b, 0, arr, 0, HALF);
        System.arraycopy(c, 0, arr, HALF, HALF);

        System.out.println("Двухпоточное выполнение: "+ (System.currentTimeMillis() - a));
    }

    public static float[] calcValue(float[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public static void fillingArr(float[] arr){
        Arrays.fill(arr, 1.0f);
    }
}
