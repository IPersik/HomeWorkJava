package home_work_8;

public class Treadmill implements Let{
    int length;

    public Treadmill(int length){
        this.length = length;
    }

    @Override
    public boolean runAway(int maxDistance) {
        return (maxDistance >= length);
    }

    @Override
    public boolean jumpOver(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "беговая дорожка, длиной: " + length + " метров";
    }
}
