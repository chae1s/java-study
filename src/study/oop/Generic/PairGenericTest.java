package study.oop.Generic;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("one", 1);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Map<String, Integer> map = new HashMap<>();

        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));
    }
}
