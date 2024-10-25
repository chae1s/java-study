package study.oop.polymorphism;

import study.oop.inheritance.*;


public class PolyMethodTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        display(dog);

        Cat cat = new Cat();
        display(cat);

    }

    private static void display(Animal animal) {
        animal.cry();

        if (animal instanceof Cat) {
            ((Cat) animal).play();
        }
    }

}
