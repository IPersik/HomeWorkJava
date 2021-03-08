package home_work_7;

public class Cat {
    private String name;
    private int appetite;
    private int catSatiety;
    private int catPlaceInTheStomach;
    private boolean ateAndAsleep;



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.catSatiety = 0;
        this.catPlaceInTheStomach = this.appetite * 3;
        this.ateAndAsleep = false;

    }

    public String getName(){
        return name;
    }

    public int getAppetite(){
        return appetite;
    }

    public int getCatSatiety(){
        return catSatiety;
    }

    public int getCatPlaceInTheStomach(){
        return catPlaceInTheStomach;
    }

    public boolean isAteAndAsleep(){
        return ateAndAsleep;
    }git

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", аппетит: " + appetite + ", сытость: " + catSatiety + ", сколько нужно съесть для насыщения: " + catPlaceInTheStomach;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)){
            this.catSatiety += appetite;
            if (catSatiety == catPlaceInTheStomach){
                ateAndAsleep = true;
            }
        }
    }
}
