package javacore.homework23;

import java.util.ArrayList;
import java.util.Comparator;

public class Fraction {
    String name;
    ArrayList<Deputy> deputies = new ArrayList<>();

    Fraction(String name) {
        this.name = name;
    }

    void addDeputy(Deputy deputy) {
        deputies.add(deputy);
    }
    void removeDeputy(Deputy deputy) {
        deputies.remove(deputy);
    }
    void showBribes() {
        deputies.forEach(deputy -> {
            if (deputy.isBribe) {
                System.out.println(deputy.name + "" + deputy.surname);
            }
        });
    }
    Deputy theMostBribe() {
        Object[] sortedDeputies = deputies.stream()
                .sorted(Comparator.comparingInt(Deputy::getBribeAmount))
                .toArray();
        return (Deputy) sortedDeputies[0];
    }
    Deputy selectDeputy(String name, String surname) {
        return deputies.stream()
                .filter(deputy -> deputy.name.equals(name) && deputy.surname.equals(surname))
                .findAny()
                .get();
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
