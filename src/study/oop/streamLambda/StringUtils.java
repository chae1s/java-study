package study.oop.streamLambda;

public class StringUtils {
    // 인스턴스 메서드
    public String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
