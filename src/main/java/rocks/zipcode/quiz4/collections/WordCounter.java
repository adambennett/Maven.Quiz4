package rocks.zipcode.quiz4.collections;

import java.util.*;

public class WordCounter {

    private Map<String, Integer> frequency;

    public WordCounter(String... strings) {
        frequency = new HashMap<>();
        for (String word : strings) {
            frequency.compute(word, (k, v) -> (v == null) ? 1 : v+1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return frequency;
    }
}
