package javacore.homework23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupremeCouncil supremeCouncil = new SupremeCouncil();
        String menu;
        while (true) {
            System.out.println("Меню: \n" +
                    "Введіть 1 щоб додати фракцію\n" +
                    "Введіть 2 щоб видалити конкретну фракцію\n" +
                    "Введіть 3 щоб вивести усі  фракції\n" +
                    "Введіть 4 щоб очистити конкретну фракцію\n" +
                    "Введіть 5 щоб вивести конкретну фракцію\n" +
                    "Введіть 6 щоб додати депутата в фракцію\n" +
                    "Введіть 7 щоб вивести список хабарників\n" +
                    "Введіть 8 щоб вивести найбільшого хабарника\n" +
                    "Введіть 9 щоб видалити дипутата з фракції\n" +
                    "Введіть 0 щоб вийти"
            );
            menu = scanner.nextLine();
            switch (menu) {
                case "1" -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.addFraction(name);
                }
                case "2" -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.removeFraction(name);
                }
                case "3" -> supremeCouncil.showAll();
                case "4" -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.selectFraction(name).removeAll();
                }
                case "5" -> {
                    System.out.println("Назва фракції: ");
                    String name = scanner.nextLine();
                    supremeCouncil.showFraction(name);
                }
                case "6" -> {
                    System.out.println("Назва фракції: ");
                    String fractionName = scanner.nextLine();
                    System.out.println("Імя дипутата: ");
                    String deputyName = scanner.nextLine();
                    System.out.println("Фамілія дипутат: ");
                    String deputySurname = scanner.nextLine();
                    System.out.println("Дипутат хабарник?(true/false): ");
                    boolean isBribe = scanner.nextBoolean();
                    Deputy deputy = new Deputy(deputyName, deputySurname, isBribe);
                    if (deputy.isBribe) { deputy.giveBribe(); }
                    Fraction fraction = supremeCouncil.selectFraction(fractionName);
                    supremeCouncil.addDeputyInFraction(fraction, deputy);
                }
                case "7" -> supremeCouncil.fractions.forEach(Fraction::showBribes);
                case "8" -> {
                    supremeCouncil.showTheMostBribe();
                }
                case "9" -> {
                    System.out.println("Назва фракції: ");
                    String fractionName = scanner.nextLine();
                    System.out.println("Імя дипутата: ");
                    String deputyName = scanner.nextLine();
                    System.out.println("Фамілія дипутат: ");
                    String deputySurname = scanner.nextLine();
                    Fraction fraction = supremeCouncil.selectFraction(fractionName);
                    Deputy deputy = fraction.selectDeputy(deputyName, deputySurname);
                    supremeCouncil.removeDeputy(fraction, deputy);
                }
                case "0" -> System.exit(1);
            }
        }
    }
}


