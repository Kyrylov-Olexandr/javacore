package javacore.homework15;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Pet> pets = new ArrayList<>();
    String name;
    Integer age;

    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member(name: " + name + ", age: " + age + ")";
    }
}

