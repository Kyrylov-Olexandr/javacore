package javacore.homework13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupremeCouncil supremeCouncil = new SupremeCouncil();
        int menu;
        while (true) {
            System.out.println("Меню: \n" +
                    "Введіть 1 щоб додати фракцію\n" +
                    "Введіть 2 щоб видалити конкретну фракцію\n" +
                    "Введіть 3 щоб вивести усі  фракції\n" +
                    "Введіть 4 щоб очистити конкретну фракцію\n" +
                    "Введіть 5 щоб вивести конкретну фракцію\n" +
                    "Введіть 6 щоб додати депутата в фракцію\n" +
                    "Введіть 7 щоб вивести список хабарників\n" +
                    "Введіть 8 щоб вивести найбільшого хабарника" +
                    "Введіть 9 щоб вийти"
            );
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.addFraction(name);
                }
                case 2 -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.removeFraction(name);
                }
                case 3 -> supremeCouncil.showAll();
                case 4 -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.selectFraction(name).removeAll();
                }
                case 5 -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.showAllInFraction(supremeCouncil.selectFraction(name));
                }
                case 6 -> {
                    System.out.println("Назва фракції: ");
                    String fractionName = scanner.nextLine();
                    System.out.println("Імя дипутата: ");
                    String deputyName = scanner.nextLine();
                    System.out.println("Фамілія дипутат: ");
                    String deputySurname = scanner.nextLine();
                    System.out.println("Дипутат хабарник?(true/false): ");
                    boolean isBribe = scanner.nextBoolean();
                    supremeCouncil.selectFraction(fractionName).addDeputy(deputyName, deputySurname, isBribe);
                }
                case 7 -> supremeCouncil.fractions.forEach(Fraction::showBribes);
                case 8 -> {
                    ArrayList<Deputy> mostBribes = new ArrayList<>();
                    supremeCouncil.fractions.forEach(fraction -> mostBribes.add(fraction.theMostBribe()));
                    mostBribes.sort(Comparator.comparingInt(Deputy::getBribeAmount));
                    for (Deputy deputy : mostBribes) {
                        if (!mostBribes.iterator().hasNext()) {
                            System.out.println(deputy);
                        }
                    }
                }
                case 9 -> System.exit(1);
            }
        }
    }
}


