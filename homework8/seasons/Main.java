package homework8.seasons;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");

        String month = scanner.nextLine();

        for(Months elem : Months.values()) {
            if (month.equalsIgnoreCase(elem.name) == true) {

                int indexOfSeason = Arrays.asList(elem.getSeason().values()).indexOf(elem.getSeason());


                System.out.println("Month found! Сhoose an action:");
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
                            if (elem.getSeason().equals(sameSeason.getSeason()) && sameSeason.name.equalsIgnoreCase(elem.name) == false) {
                                System.out.println(sameSeason.name());
                            }
                        }

                    case "2":
                        for (Months sameDays : Months.values()) {
                            if (elem.getDay() == sameDays.getDay() && sameDays.name.equalsIgnoreCase(elem.name) == false) {
                                System.out.println(sameDays.name);
                            }
                        }

                    case "3":
                        for (Months lessDays : Months.values()) {
                            if (elem.getDay() > lessDays.getDay()) {
                                System.out.println(lessDays.name);
                            }
                        }

                    case "4":
                        for (Months moreDays : Months.values()) {
                            if (elem.getDay() < moreDays.getDay()) {
                                System.out.println(moreDays.name);
                            }
                        }

                    case "5":
                        System.out.println(elem.getSeason().values()[indexOfSeason + 1]);

                    case "6":
                        System.out.println(elem.getSeason().values()[indexOfSeason - 1]);

                    case "7":
                        for (Months evenDays : Months.values()) {
                            if (evenDays.getDay() % 2 == 0) {
                                System.out.println(evenDays.name);
                            } else {
                                continue;
                            }
                        }

                    case "8":
                        for (Months evenDays : Months.values()) {
                            if (evenDays.getDay() % 2 != 0) {
                                System.out.println(evenDays.name);
                            } else {
                                continue;
                            }
                        }

                    case "9":
                        System.out.println(elem.getDay() % 2 == 0 ? elem.name + " has an even number of days (" + elem.getDay() + ")." : elem.name + "has an add number of days (" + elem.getDay() + ")");

                }

            } else {
                System.out.println("Months not found!");
            }
        }
    }
}
