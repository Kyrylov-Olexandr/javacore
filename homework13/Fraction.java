package javacore.homework13;

import javacore.homework17.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Fraction {
    String name;
    ArrayList<Deputy> deputies = new ArrayList<>();

    Fraction(String name) {
        this.name = name;
    }

    void addDeputy(String name, String surname, boolean isBribe) {
        deputies.add(new Deputy(name, surname, isBribe));
    }
    void removeDeputy(String name, String surname) {
        deputies.removeIf(deputy -> deputy.name.equals(name) && deputy.surname.equals(surname));
    }
    void showBribes() {
        deputies.forEach(deputy -> {
            if (deputy.isBribe) {
                System.out.println(deputy.name + "" + deputy.surname);
            }
        });
    }
    Deputy theMostBribe() {
        ArrayList<Deputy> sortedDeputies = new ArrayList<>(deputies);
        sortedDeputies.sort(Comparator.comparingInt(Deputy::getBribeAmount));
        for(Deputy deputy : sortedDeputies ) {
            if (!sortedDeputies.iterator().hasNext()) {
                return (deputy);
            }
        }
        return null;
    }
    Deputy selectDeputy(String name, String surname) {
        for (Deputy deputy : deputies) {
            if(deputy.name.equals(name) && deputy.surname.equals(surname)) {
                return deputy;
            }
        }
        return null;
    }
    void showAll() {
        deputies.forEach(System.out::println);
    }
    void removeAll() {
        deputies.clear();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                ", deputies=" + deputies +
                '}';
    }
}
