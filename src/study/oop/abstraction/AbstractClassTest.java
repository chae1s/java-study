package study.oop.abstraction;

public class AbstractClassTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();
        animal.eat();

        animal = new Cat();
        animal.cry();
    }
}
