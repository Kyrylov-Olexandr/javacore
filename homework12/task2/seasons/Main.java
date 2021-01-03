package javacore.homework12.task2.seasons;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");

        String month = scanner.nextLine();

        for(Months elem : Months.values()) {
            if (month.equalsIgnoreCase(elem.name)) {

                int indexOfSeason = Arrays.asList(Seasons.values()).indexOf(elem.getSeason());


                System.out.println("Month found! Select an action:");
                System.out.println(
                                "1) Display all months with the same season\n" +
                                "2) Display all months that have the same number of days\n" +
                                "3) Display all months with fewer days\n" +
                                "4) Display all months that have more days\n" +
                                "5) Display the next season\n" +
                                "6) Display the previous season\n" +
                                "7) Display all months that have an even number of days\n" +
                                "8) Display all months that have an odd number of days\n" +
                                "9) Check whether the month entered has an even number of days"
                );

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        for (Months sameSeason : Months.values()) {
                            if (elem.getSeason().equals(sameSeason.getSeason())) {
                                System.out.println(sameSeason.getName());
                            }
                        }
                        break;

                    case "2":
                        for (Months sameDays : Months.values()) {
                            if (elem.getDay() == sameDays.getDay()) {
                                System.out.println(sameDays.getName());
                            }
                        }
                        break;

                    case "3":
                        for (Months lessDays : Months.values()) {
                            if (elem.getDay() > lessDays.getDay()) {
                                System.out.println(lessDays.getName());
                            }
                        }
                        break;

                    case "4":
                        for (Months moreDays : Months.values()) {
                            if (elem.getDay() < moreDays.getDay()) {
                                System.out.println(moreDays.getName());
                            }
                        }
                        break;

                    case "5":
                        System.out.println(indexOfSeason < 3 ? Seasons.values()[indexOfSeason + 1] : Seasons.values()[indexOfSeason - 3]);
                        break;

                    case "6":
                        System.out.println(indexOfSeason > 0 ? Seasons.values()[indexOfSeason - 1] : Seasons.values()[indexOfSeason + 3]);
                        break;

                    case "7":
                        for (Months evenDays : Months.values()) {
                            if (evenDays.getDay() % 2 == 0) {
                                System.out.println(evenDays.getName());
                            }
                        }
                        break;
                    case "8":
                        for (Months evenDays : Months.values()) {
                            if (evenDays.getDay() % 2 != 0) {
                                System.out.println(evenDays.getName());
                            }
                        }
                        break;
                    case "9":
                        System.out.println(elem.getDay() % 2 == 0
                                ? elem.getName() + " has an even number of days (" + elem.getDay() + ")."
                                : elem.getName() + "has an add number of days (" + elem.getDay() + ")"
                        );
                        break;
                }

            }
        }
    }
}
