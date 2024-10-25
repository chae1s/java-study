package study.oop.inheritance;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.cry();

        animal = new Cat();

        animal.cry();


    }
}
