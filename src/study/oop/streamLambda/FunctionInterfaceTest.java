package study.oop.streamLambda;

public class FunctionInterfaceTest implements MathOperation{


    public static void main(String[] args) {
        MathOperation mathOperation = new FunctionInterfaceTest();
        int result = mathOperation.operation(10, 20);

        System.out.println("10 + 20 = " + result);
    }

    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
