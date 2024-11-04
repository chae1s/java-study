package study.oop.streamLambda;

import study.oop.api.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
