package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class WaterSlide extends WavePool {

    double heightLimit;
    int peoplePerRaft;

    public WaterSlide(int maxOccupancy, String name, double waitTime, boolean hasWaterFall, double waveSize, double heightLimit) {
        super(maxOccupancy, name, waitTime, hasWaterFall, waveSize);
        this.heightLimit = heightLimit;
    }

    @Override
    public int peoplePerRaft() {
        super.peoplePerRaft();
        return 4;
    }

    public double getHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(double heightLimit) {
        this.heightLimit = heightLimit;
    }

    public int getPeoplePerRaft() {
        return peoplePerRaft;
    }

    public void setPeoplePerRaft(int peoplePerRaft) {
        this.peoplePerRaft = peoplePerRaft;
    }
}
