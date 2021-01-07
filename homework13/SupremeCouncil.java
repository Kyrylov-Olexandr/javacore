package javacore.homework13;

import java.util.ArrayList;
import java.util.Comparator;

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
        selectFraction(name).showAll();
    }
    void addDeputyInFraction(Fraction fraction, Deputy deputy) {
        fraction.addDeputy(deputy);
    }
    void removeDeputy(Fraction fraction, Deputy deputy) {
        fraction.removeDeputy(deputy);
    }
    void showTheMostBribe () {
        ArrayList<Deputy> mostBribes = new ArrayList<>();
        fractions.forEach(fraction -> mostBribes.add(fraction.theMostBribe()));
        mostBribes.sort(Comparator.comparingInt(Deputy::getBribeAmount));
        System.out.println(mostBribes.get(0));

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
