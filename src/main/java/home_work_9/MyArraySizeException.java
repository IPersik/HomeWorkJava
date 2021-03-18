package home_work_9;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(){
        super("Размер массива не соответсвует размеру 4х4");
    }

    public MyArraySizeException(String mes){
        super(mes);
    }
}
