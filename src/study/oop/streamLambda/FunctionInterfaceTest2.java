package study.oop.streamLambda;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }

        };

        int result = mathOperation.operation(10, 20);

        System.out.println("10 + 20 = " + result);
    }
}
