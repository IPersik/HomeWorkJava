package home_work_9;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(){
        super("В массиве есть элемент, которй не являтся числом");
    }

    public MyArrayDataException(String mes){
        super(mes);
    }
}
