package home_work_11;

public class ChangeOfPlaces<T> {

    @SafeVarargs
    public ChangeOfPlaces(T... arr) {
    }

    public T[] changeOfPlace(T[] array, int index_1, int index_2) {
        T elem = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = elem;
        return array;
    }

}
