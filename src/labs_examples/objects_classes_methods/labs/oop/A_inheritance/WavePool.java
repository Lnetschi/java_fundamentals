package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class WavePool extends LazyRiver {

    double waveSize;

    public WavePool(int maxOccupancy, String name, double waitTime, boolean hasWaterFall, double waveSize) {
        super(maxOccupancy, name, waitTime, hasWaterFall);
        this.waveSize = waveSize;
    }

    public double waveSize() {
        return waveSize;
    }

    public void setLifeJacketRequired(boolean lifeJacketRequired) {
        this.waveSize = waveSize;
    }

//    @Override
//    public double getWaitTime() {
//        super.getWaitTime();
//        System.out.println("No wait time.");
//        return 0;
//    }
}
