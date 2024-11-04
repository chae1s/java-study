package study.oop.streamLambda;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        // 정적 메소드 참조
        Converter<String, Integer> converter = IntegerUtils::stringToInt;

        Integer result = converter.convert("123");
        System.out.println(result);
    }
}
