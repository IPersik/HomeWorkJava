package home_work_7;

public class Plate {
    private int food;

    public Plate(int countFoods) {
        food = countFoods < 0 ? -countFoods : countFoods;
        printInfo();
    }

    public boolean decreaseFood(int countFoods) {
        if(countFoods > food) {
            return false;
        }else {
            food -= countFoods;
            return true;
        }
    }

    public void putFood (int countFoods){  // с помощью метода можно положить еду в миску
        food += countFoods < 0 ? -countFoods : countFoods;
    }

    public void printInfo() {
        System.out.println("Количество еды в миске: " + food);
    }

    public int getFood() {
        return food;
    }
}
