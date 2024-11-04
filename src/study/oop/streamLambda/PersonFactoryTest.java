package study.oop.streamLambda;

import study.oop.api.Person;

public class PersonFactoryTest {
    public static void main(String[] args) {
        /*
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("Hermione", 20);

        System.out.println(person);

        */

        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };

        Person person = personFactory.create("Hermione", 20);

        System.out.println(person);
    }
}
