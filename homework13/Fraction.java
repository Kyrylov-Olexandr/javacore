package javacore.homework13;


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
        deputies.sort(Comparator.comparingInt(Deputy::getBribeAmount));
        return deputies.get(0);
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
