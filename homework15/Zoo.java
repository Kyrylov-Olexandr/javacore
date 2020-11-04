package javacore.homework15;

import java.util.*;

public class Zoo {

    Map<Person, List<Pet>> members = new HashMap<>();

    Person selectMember(String name, String age){
        for(Person person : members.keySet()) {
            if (person.name.equals(name) && person.age == Integer.parseInt(age)) {
                return person;
            }
        }
        return null;
    }

    void addMember(String name, String age) {
        Person person = new Person(name, Integer.parseInt(age));
        members.put(person, person.pets);
    }

    void addPetToMember(String memberName, String memberAge, String petGenus, String petName){
        members.get(selectMember(memberName, memberAge)).add(new Pet(petGenus, petName));
    }

    void removePetFromMember(String memberName, String memberAge, String petName) {
        members.get(selectMember(memberName, memberAge)).removeIf(pet -> (pet.name.equals(petName)));
    }

    void removeMember(String name, String age) {
        members.remove(selectMember(name,age));
    }

    void removePetsByGenus(String petGenus) {
        for(Person person: members.keySet()) {
            members.get(person).removeIf(pet -> (pet.genus.equals(petGenus)));
        }
    }
}
