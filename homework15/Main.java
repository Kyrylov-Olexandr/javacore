package javacore.homework15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        while (true) {
            System.out.println(
                    "ZooClub menu:\n" +
                            "1)Add member\n" +
                            "2)Add pet to member\n" +
                            "3)Delete pet from member\n" +
                            "4)Delete member\n" +
                            "5)Delete all pets of specific genus\n" +
                            "5)Show ZooClub members\n" +
                            "7)Exit"
            );

            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member age: ");
                    String memberAge = scanner.nextLine();
                    zoo.addMember(memberName, memberAge);
                    System.out.println("New member added.");
                    System.out.println(zoo.members + "\n");
                }
                case "2" -> {
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member age: ");
                    String memberAge = scanner.nextLine();
                    System.out.print("Enter pet species: ");
                    String petGenus = scanner.nextLine();
                    System.out.print("Enter pet name: ");
                    String petName = scanner.nextLine();
                    zoo.addPetToMember(memberName, memberAge, petGenus, petName);
                    System.out.println(zoo.members + "\n");
                }
                case "3" -> {
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member age: ");
                    String memberAge = scanner.nextLine();
                    System.out.print("Enter pet name: ");
                    String petName = scanner.nextLine();
                    zoo.removePetFromMember(memberName, memberAge, petName);
                    System.out.println(zoo.members + "\n");
                }
                case "4" -> {
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member age: ");
                    String memberAge = scanner.nextLine();
                    zoo.removeMember(memberName, memberAge);
                    System.out.println(zoo.members + "\n");
                }
                case "5" -> {
                    System.out.print("Enter pet genus: ");
                    String petGenus = scanner.nextLine();
                    zoo.removePetsByGenus(petGenus);
                    System.out.println(zoo.members + "\n");
                }
                case "6" -> {
                    System.out.println(zoo.members.keySet() + "\n");
                }
                case "7" -> {
                    System.exit(1);
                }
            }
        }
    }
}

