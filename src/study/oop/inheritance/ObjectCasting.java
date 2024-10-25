package study.oop.inheritance;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal animal = new Dog();

        animal.cry();

        animal = new Cat();     // Up casting

        animal.cry();
        // animal.play(); 하위클래스에는 있고 상위클래스에는 없는 메소드를 가져올 수 없다.

        Cat cat = (Cat) animal;  // Down casting
        cat.play();

    }
}
