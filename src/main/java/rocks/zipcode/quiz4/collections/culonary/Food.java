package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private final ArrayList<Spice> spicesAdded;

    public Food() {
        spicesAdded = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spicesAdded;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<>();
        for(Spice s: spicesAdded){
            map.compute((SpiceType)s.getClass(), (k,v) -> (v == null) ? 1: v+1);
        }
        return map;
    }

    public void applySpice(Spice spice) {
        spicesAdded.add(spice);
    }
}
