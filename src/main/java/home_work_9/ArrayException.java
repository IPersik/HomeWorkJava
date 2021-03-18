package home_work_9;

public class ArrayException {
    public static void main(String[] args){
        System.out.println(arrayCheck(arr));
        System.out.println(arrayCheck(arr3));
        System.out.println(arrayCheck(arr2));
        System.out.println(arrayCheck(arr4));

    }
    private static final String[][] arr = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}};
    private static final String[][] arr2 = {{"1", "2", "3", "]"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"},
            {"1", "2", "3", "0"}};
    private static final String[][] arr3 = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"},
            {"1", "2", "3"}};
    private static final String[][] arr4 = {{"a", "a", "a", "a"}, {"a", "a", "a", "a"}, {"a", "a", "a", "a"},
            {"a", "a", "a", "a"}};

    private static int arrayCheck(String[][] arry){ //если массив соответствует размеру 4х4, то подсчет суммы будет выполняться до первой ошибки
        int sum = 0;

        try {
            for (int i = 0; i < arry.length; i++) {
                if (4 != arry[i].length) {
                    throw new MyArraySizeException("Неверное количество столбцов в строке " + i + "-й. Массив не соответсвует размеру 4х4");
                }
                for (int j = 0; j < arry[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arry[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("В точке с индексом x = " + i + ", y = " + j + " записано не число");
                    }
                }
            }
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
