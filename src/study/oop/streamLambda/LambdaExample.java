package study.oop.streamLambda;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = (int x, int y) -> {
            return x + y;};

        int result = add.operation(10, 20);

        System.out.println("10 + 20 = " + result);

        MathOperation add2 = (x, y) -> x + y;

        int result2 = add2.operation(10, 20);

        System.out.println("10 + 20 = " + result2);

        MathOperation multi = (x, y) -> x * y;

        int multiResult = multi.operation(3, 2);

        System.out.println("3 * 2 = " + multiResult);
    }
}
