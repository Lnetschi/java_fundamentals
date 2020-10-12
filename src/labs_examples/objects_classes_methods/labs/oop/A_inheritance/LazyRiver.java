package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class LazyRiver extends Waterpark {

    boolean hasWaterFall;

    public LazyRiver(int maxOccupancy, String name, double waitTime, boolean hasWaterFall) {
        super(maxOccupancy, name, waitTime);
        this.hasWaterFall = hasWaterFall;
    }

    @Override
    public int peoplePerRaft() {
        super.peoplePerRaft();
        return 1;
    }

    public boolean isHasWaterFall() {
        return hasWaterFall;
    }

    public void setHasWaterFall(boolean hasWaterFall) {
        this.hasWaterFall = hasWaterFall;
    }


}
