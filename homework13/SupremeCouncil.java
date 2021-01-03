package javacore.homework13;

import java.util.ArrayList;

public class SupremeCouncil {
    ArrayList<Fraction> fractions = new ArrayList<>();

    void addFraction(String name) {
        fractions.add(new Fraction(name));
    }
    void removeFraction(String name) {
        fractions.removeIf(fraction -> fraction.name.equalsIgnoreCase(name));
    }
    void showAll() {
        fractions.forEach(System.out::println);
    }
    void showFraction(String name) {
        System.out.println(fractions.stream().filter(fraction -> fraction.name.equalsIgnoreCase(name)));
    }
    void addDeputyInFraction(Fraction fraction, String name, String surname, Boolean isBribe) {
        fraction.addDeputy(name, surname, isBribe);
    }
    void removeDeputy(String name, String surname) {
        fractions.forEach(fraction -> fraction.removeDeputy(name, surname));
    }
    void showBribesInFraction(Fraction fraction) {
        fraction.showBribes();
    }
    void showTheMostBribe(Fraction fraction) {
        System.out.println(fraction.theMostBribe());
    }
    void showAllInFraction(Fraction fraction){
        fraction.showAll();
    }
    Fraction selectFraction(String name) {
        for (Fraction fraction : fractions) {
            if (fraction.name.equalsIgnoreCase(name)) {
                return fraction;
            }
        }
        return null;
    }
}
