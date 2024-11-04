package study.oop.streamLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harry", "Ron", "Hermione");

        Collections.sort(names, String::compareTo);
        System.out.println(names);
    }


}
