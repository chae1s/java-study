package study.oop.Generic;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCalculator<Integer> integerCalculator = new AverageCalculator<>(integers);

        double integerAvg = integerCalculator.calculateAverage();

        System.out.println(integerAvg);

        AverageCalculator<Double> doubleCalculator = new AverageCalculator<>(doubles);

        double doubleAvg = doubleCalculator.calculateAverage();

        System.out.println(doubleAvg);
    }
}
