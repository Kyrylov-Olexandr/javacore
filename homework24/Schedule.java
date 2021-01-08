package javacore.homework24;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    Set<Seance> seances = new TreeSet<>();

    void addSeance (Seance seance) {
        seances.add(seance);
    }
    void removeSeance (Seance seance) {
        seances.remove(seance);
    }

    void showSeances () {
        System.out.println("========================\n" +
                           "     РОЗКЛАД СЕАНСІВ:");
        int i = 1;
        for (Seance seance : seances) {
            System.out.println(i + ". " + seance);
            i++;
        }
        System.out.println("========================\n");
    }

}
