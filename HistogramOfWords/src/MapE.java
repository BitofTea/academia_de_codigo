import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapE implements Iterable<String> {

    private Map<String, Integer> histogram;

    public MapE(String word) {

        histogram = new HashMap<>();

        for (String p : word.split(" ")) {
            if (histogram.containsKey(p)) {
                int value = histogram.get(p);
                value++;
                histogram.put(p, value);

            } else {

                histogram.put(p, 1);
            }

        }
    }

    public int get(String name) {
        return histogram.get(name);

    }


    @Override
    public Iterator<String> iterator() {
        return histogram.keySet().iterator();
    }
}
