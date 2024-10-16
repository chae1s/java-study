package study.oop;

public class Person {
    // 멤버 변수(상태 정보)
    public String name;
    public int age;
    public String phone;

    // 기본 생성자 생략
    public Person() {
        // 객체를 생성하는 코드 생략
    }

    // 멤버 메서도(행위)
    public void play() {
        System.out.println("운동을 한다.");
    }

    public void eat() {
        System.out.println("음식을 먹다.");
    }

    public void walk() {
        System.out.println("걷다.");
    }
}
