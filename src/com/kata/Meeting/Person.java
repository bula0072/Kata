package com.kata.Meeting;

import java.util.Comparator;

public class Person {
    private String name;
    private String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    private String getSurname() {
        return surname;
    }

    @Override public String toString() {
        return "(" +
                surname +
                ", " +
                name +
                ")";
    }

    static Comparator<Person> compareBySurname = Comparator.comparing(Person::getSurname);

    static Comparator<Person> compareByName = (o1, o2) -> 0;
}
