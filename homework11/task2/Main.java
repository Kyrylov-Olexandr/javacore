package javacore.homework11.task2;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        int r2 = (int) (Math.random() * 4)+2;
        int r1 = (int) (Math.random() * 4)+2;
        Car[][] cars = new Car[r1][r2];
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                cars[i][j] = new Car();
            }
        }

        System.out.println(Arrays.deepToString(cars));

        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "1) Display array elements as string \n " +
                "2) Set value to car class \n " +
                "3) Sort objects in ascending order \n " +
                "4) Sort objects in descending order \n" +
                "Make a choice: "
        );
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                for (Car[] car : cars) {
                    System.out.println(Arrays.deepToString(car));
                }
                break;
            case "2":
            case "3":
                System.out.println(
                                "1) Year\n" +
                                "2) Horsepower\n" +
                                "3) Engine;\n" +
                                "4) SteeringWheel\n" +
                                "Make a choice: "
                );
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getYear() - car2.getYear());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                    case "2":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getHorsepower() - car2.getHorsepower());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                    case "3":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getEngine().getCylinders() - car2.getEngine().getCylinders());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                    case "4":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getSteeringWheel().getDiameter() - car2.getSteeringWheel().getDiameter());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                }
                break;

            case "4":
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getYear() + car2.getYear());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                    case "2":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getHorsepower() + car2.getHorsepower());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                    case "3":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getEngine().getCylinders() + car2.getEngine().getCylinders());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }
                        break;
                    case "4":
                        for (Car[] car : cars) {
                            Arrays.sort(car, (car1, car2) -> car1.getSteeringWheel().getDiameter() + car2.getSteeringWheel().getDiameter());
                        }
                        for (Car[] car : cars) {
                            System.out.println(Arrays.deepToString(car));
                        }

                        break;
                }
                break;
        }

    }

}
