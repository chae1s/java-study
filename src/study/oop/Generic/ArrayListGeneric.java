package study.oop.Generic;

import study.oop.api.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Harry", 20));
        people.add(new Person("Hermione", 20));

        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");

        System.out.println(people.get(1));
        System.out.println(list.get(0));

    }
}
