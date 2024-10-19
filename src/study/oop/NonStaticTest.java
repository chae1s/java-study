package study.oop;

public class NonStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        NonStaticTest nonStaticTest = new NonStaticTest();
        int sum = nonStaticTest.hap(a, b);

        System.out.println(sum);
    }

    public int hap(int a, int b) {
        int v = a + b;

        return v;
    }
}


