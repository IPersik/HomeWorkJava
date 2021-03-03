package home_work_3;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 0) zeroOne[i] = 1;
            else zeroOne[i] = 0;
        }
        System.out.println(java.util.Arrays.toString(zeroOne));


        System.out.println("Задание 2");
        final int size_arr = 8;
        int[] arrayForThree = new int[size_arr];
        for (int i = 1, j = 0; i < arrayForThree.length; i++) {
            arrayForThree[i] = j += 3;
        }
        System.out.println(java.util.Arrays.toString(arrayForThree));


        System.out.println("Задание 3");
        int[] arrayLessSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayLessSix.length; i++) {
            if (arrayLessSix[i] < 6) arrayLessSix[i] *= 2;
        }
        System.out.println(java.util.Arrays.toString(arrayLessSix));


        System.out.println("Задание 4");
        int[][] squareArray = new int[6][6];

        for (int n = 0; n < squareArray.length; n++) {
            for (int j = 0, k = squareArray[n].length; j < squareArray[n].length; j++, k--) {
                if (n == j || n == (k - 1)) squareArray[n][j] = 1;
                System.out.printf("%3d", squareArray[n][j]);
            }
            System.out.println();
        }


        System.out.println("Задание 5 **");
        int[] minMaxArray = new int[10];
        for (int i = 0; i < 10; i++) {
            minMaxArray[i] = (int) (Math.random() * 100);
        }

        int minArr = minMaxArray[0];
        int maxArr = minMaxArray[0];

        for (int i : minMaxArray) {
            if (i < minArr) {
                minArr = i;
            }
            if (i > maxArr) {
                maxArr = i;
            }
        }
        System.out.println("Массив: " + java.util.Arrays.toString(minMaxArray));
        System.out.println("Минимальное значение в массиве = " + minArr);
        System.out.println("Максимально значение в массиве = " + maxArr);


        System.out.println("Задание 6 **");
        int [] arrA = {1, -1, 2, 3, 5};
        System.out.println(checkBalance(arrA));
    }

    public static boolean checkBalance(int[] arr){
        int allSum = java.util.Arrays.stream(arr).sum();
        int leftSum = 0;
        for (int j : arr) {
            allSum -= j;
            leftSum += j;
            if (leftSum == allSum) {
                return true;
            }
        }
        return false;
    }
}
