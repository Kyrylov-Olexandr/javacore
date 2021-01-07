package javacore.homework13;

import java.util.Scanner;

public class Deputy extends Person {
    boolean isBribe;
    int bribeAmount;


    public int getBribeAmount() {
        return bribeAmount;
    }

    public Deputy(String name, String surname, boolean isBribe) {
        super(name, surname);
        this.isBribe = isBribe;
    }

    void giveBribe() {
        Scanner scanner = new Scanner(System.in);
        if (isBribe) {
           System.out.println("Введіть суму хабара: ");
           int bribe = scanner.nextInt();
           if (bribe > 5000) {
               System.out.println("Миліція увязнить депутата");
           } else {
               bribeAmount = bribe;
           }
        } else {
            System.out.println("Цей депутат не бере хабарів");
        }
     }

    @Override
    public String toString() {
        return "Deputy{" +
                "isBribe=" + isBribe +
                ", bribeAmount=" + bribeAmount +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
