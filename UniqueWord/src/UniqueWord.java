import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueWord implements Iterable<String> {


    private Set<String> set;

    public UniqueWord(String word) {
        set = new HashSet<>();

        for (String p : word.split(" ")) {
            set.add(p);

        }

    }

    @Override
    public Iterator<String> iterator() {
        return set.iterator();

    }
}

