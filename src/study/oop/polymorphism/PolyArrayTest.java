package study.oop.polymorphism;

import study.oop.inheritance.Animal;
import study.oop.inheritance.Cat;
import study.oop.inheritance.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Cat cat = new Cat();

        Animal[] animals = new Animal[2];

        animals[0] = dog;
        animals[1] = cat;

        display(animals);
    }

    private static void display(Animal[] animals) {
        for (Animal animal : animals) {
            animal.cry();
            if (animal instanceof Cat) {
                ((Cat) animal).play();
            }
        }
    }
}
