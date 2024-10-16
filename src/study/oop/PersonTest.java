package study.oop;

public class PersonTest {

    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언
        // 객체를 메모리에 생성 -> 인스턴스를 만드는 과정
        Person person = new Person();

        person.name = "홍길동";
        person.age = 30;
        person.phone = "010-1111-1111";

        System.out.println(person.name + "\t" + person.age + "\t" + person.phone);

        person.play();
        person.eat();
        person.walk();
    }
}
