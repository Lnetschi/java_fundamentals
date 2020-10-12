package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class WaterParkController {

    public static void main(String[] args) {

        Waterpark park = new Waterpark(8000, "Dolly Wood",0);
        WaterSlide slide = new WaterSlide(4, "Tornado", 20, false, 26.2, 56 );
        LazyRiver river =  new LazyRiver(300, "Relaxing float", 0, true);
        WavePool pool = new WavePool(150, "Big waves", 0, true, 23.2);
        KidsSection kids = new KidsSection(75, "Kids Place", 0,true, 12, true);

        System.out.println(slide.getName() + " wait time " + slide.getWaitTime() + " height limit " + slide.getHeightLimit() + " People per raft- "
                + slide.peoplePerRaft());

        System.out.println(river.getName() + " has waterfall-" + river.hasWaterFall + " max people " + river.maxOccupancy + " People per raft- "
                + river.peoplePerRaft());

        System.out.println(kids.getName() + " max age limit " + kids.getMaxAgeLimit() + " has kids slides- " + kids.hasKidsSlides +
                " people per raft- " + kids.peoplePerRaft());

        System.out.println(pool.getName() + " wait time " + pool.getWaitTime() + " wave size " + pool.waveSize);

        System.out.println(park.getName() + " max occupancy " + park.getMaxOccupancy() + " wait times " + park.waitTime );
    }
}
