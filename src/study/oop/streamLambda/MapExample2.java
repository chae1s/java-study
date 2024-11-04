package study.oop.streamLambda;

import java.util.Arrays;
import java.util.List;

public class MapExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pineapple", "peach", "pear", "orange");

        List<String> upperWords = words.stream().map(s -> s.toUpperCase()).toList();

        System.out.println(upperWords);
    }
}
