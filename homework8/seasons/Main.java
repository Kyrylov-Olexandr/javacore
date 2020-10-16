package homework7.seasons;


import java.util.Scanner;

public class Main {
    static boolean sameName(String first, String second) {
        return first.equalsIgnoreCase(second) == true ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(
                        "1) Check if there is such a month \n" +
                        "2) Display all months with the same season\n" +
                        "3) Display all months that have the same number of days\n" +
                        "4) Display all months with fewer days\n" +
                        "5) Display all months that have more days\n" +
                        "6) Display the next season\n" +
                        "7) Display the previous season\n" +
                        "8) Display all months that have an even number of days\n" +
                        "9) Display all months that have an odd number of days\n" +
                        "10) Check whether the month entered has an even number of days"
        );

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" :
                String menu1 = scanner.nextLine();
                for(Months elem : Months.values()) {
                    if (sameName(menu1, elem.name) == true) {
                        System.out.println("Month found");
                    } else {
                        continue;
                    }
                }
                break;
            case "2" :
                String menu2 = scanner.nextLine();
                for(Months elem : Months.values()) {
                    if (sameName(menu2, elem.name) == true) {
                        for (Months sameSeason : Months.values()) {
                            if (elem.getSeason().equals(sameSeason.getSeason()) && sameName(menu2, elem.name) == false ) {
                                System.out.println(sameSeason.name());

                            }
                        }
                    }
                }
                break;
            case "3" :
                String menu3 = scanner.nextLine();
                for(Months elem : Months.values()) {
                    if (sameName(menu3, elem.name) == true) {
                        for (Months sameDays : Months.values()) {
                            if (elem.getDay() == sameDays.getDay()) {
                                System.out.println(sameDays.name);
                            } else {
                                continue;
                            }
                        }
                    }
                }
            case "4" :
                String menu4 = scanner.nextLine();
                for(Months elem : Months.values()) {
                    if (sameName(menu4, elem.name) == true) {
                        for (Months lessDays : Months.values()) {
                            if (elem.getDay() > lessDays.getDay()) {
                                System.out.println(lessDays.name);
                            } else {
                                continue;
                            }
                        }
                    }
                }
            case "5" :
                String menu5 = scanner.nextLine();
                for(Months elem : Months.values()) {
                    if (sameName(menu5, elem.name) == true) {
                        for (Months moreDays : Months.values()) {
                            if (elem.getDay() < moreDays.getDay()) {
                                System.out.println(moreDays.name);
                            } else {
                                continue;
                            }
                        }
                    }
                }
            case "6" :
                String menu6 = scanner.nextLine();
                for(Months elem : Months.values()) {
                    if (sameName(menu6, elem.name) == true) {
                        if (elem.getSeason().equals("Winter") == true) {
                            System.out.println("Spring");
                        } else if (elem.getSeason().equals("Spring") == true) {
                            System.out.println("Summer");
                        } else if (elem.getSeason().equals("Summer") == true) {
                            System.out.println("Autumn");
                        } else if (elem.getSeason().equals("Autumn") == true) {
                            System.out.println("Winter");
                        }
                    }
                }

            case "7" :
            case "8" :
            case "9" :
            case "10":
        }

    }

}


