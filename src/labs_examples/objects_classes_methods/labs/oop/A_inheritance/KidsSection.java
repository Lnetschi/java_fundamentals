package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class KidsSection extends LazyRiver {

    double maxAgeLimit;
    boolean hasKidsSlides;

    public KidsSection(int maxOccupancy, String name, double waitTime, boolean hasWaterFall, double maxAgeLimit, boolean hasKidsSlides) {
        super(maxOccupancy, name, waitTime, hasWaterFall);
        this.maxAgeLimit = maxAgeLimit;
        this.hasKidsSlides = hasKidsSlides;
    }

    @Override
    public int peoplePerRaft() {
        super.peoplePerRaft();
        return 2;
    }

    public int getMaxAgeLimit() {
        return (int) maxAgeLimit;
    }

    public void setMaxAgeLimit(int maxAgeLimit) {
        this.maxAgeLimit = maxAgeLimit;
    }
}
