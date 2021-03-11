package home_work_8;

public class Wall implements Let{
    int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public boolean runAway(int maxDistance) {
        return false;
    }

    @Override
    public boolean jumpOver(int maxHeight) {
        return (maxHeight >= height);
    }

    @Override
    public String toString() {
        return "стена, высотой " + height + " метров";
    }
}
