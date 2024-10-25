package study.oop.polymorphism;

import study.oop.inheritance.Animal;
import study.oop.inheritance.Cat;
import study.oop.inheritance.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Up casting으로 객체 생성
        // 상속관계, 재정의(Override), 동적바인딩
        // 다형성(Polymorphism) : 상위 클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal animal = new Dog();
        animal.cry();


        animal = new Cat();
        animal.cry();
    }
}
