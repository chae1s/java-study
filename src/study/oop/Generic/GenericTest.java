package study.oop.Generic;


import study.oop.api.Person;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArr<String> array = new ObjectArr<>(5);
        array.set(0, "HELLO");
        array.set(1, "WORLD");
        array.set(2, "JAVA");
        array.set(3, "GENERIC");


        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        ObjectArr<Person> people = new ObjectArr<>(3);
        people.set(0, new Person("Harry", 20));
        people.set(1, new Person("Ron", 20));
        people.set(2, new Person("Hermione", 20));

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }
}
