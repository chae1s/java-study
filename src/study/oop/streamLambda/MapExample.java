package study.oop.streamLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();

        System.out.println(squaredNumbers);
    }
}
