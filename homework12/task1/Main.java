package javacore.homework12.task1;

import javacore.homework17.Collection;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(new Car(), new Car()));

        System.out.println(cars);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.print(
                    "1) Display array elements as string \n " +
                            "2) Set value to car class \n " +
                            "3) Sort objects in ascending order \n " +
                            "4) Sort objects in descending order \n" +
                            "5) Exit \n" +
                            "Make a choice: "
            );
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> cars.forEach(System.out::println);
                case 2 -> {
                    System.out.print(
                            "1) Horsepower \n " +
                                    "2) Year \n " +
                                    "3) Engine \n " +
                                    "4) Steering wheel \n" +
                                    "5) Exit \n" +
                                    "Make a choice: "
                    );
                    int value = scanner.nextInt();
                    switch (value) {
                        case 1 -> {
                            System.out.print("Horse power: ");
                            int horsePower = scanner.nextInt();
                            cars.forEach(car -> car.horsepower = horsePower);
                        }
                        case 2 -> {
                            System.out.print("Year: ");
                            int year = scanner.nextInt();
                            cars.forEach(car -> car.year = year);
                        }
                        case 3 -> {
                            System.out.print("Cylinders amount: ");
                            int cylinders = scanner.nextInt();
                            cars.forEach(car -> car.engine = new Engine(cylinders));
                        }
                        case 4 -> {
                            System.out.println("steering wheel diameter: ");
                            int diameter = scanner.nextInt();
                            System.out.println("steering wheel material: ");
                            String material = scanner.nextLine();
                            cars.forEach(car -> car.steeringWheel = new SteeringWheel(diameter, material));
                        }
                        case 5 -> System.exit(1);
                    }
                }
                case 3 -> {
                    System.out.println(
                            "1) Year\n" +
                                    "2) Horsepower\n" +
                                    "3) Engine;\n" +
                                    "4) SteeringWheel diameter\n" +
                                    "5) Exit \n" +
                                    "Make a choice: "
                    );
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> cars.sort(Comparator.comparingInt(Car::getYear));
                        case 2 -> cars.sort(Comparator.comparingInt(Car::getHorsepower));
                        case 3 -> cars.sort(Comparator.comparingInt(car -> car.getEngine().cylinders));
                        case 4 -> cars.sort(Comparator.comparingInt(car -> car.getSteeringWheel().diameter));
                        case 5 -> System.exit(1);
                    }
                }
                case 4 -> {
                    System.out.println(
                            "1) Year\n" +
                                    "2) Horsepower\n" +
                                    "3) Engine;\n" +
                                    "4) SteeringWheel diameter\n" +
                                    "5) Exit \n" +
                                    "Make a choice: "
                    );
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> cars.sort((car1, car2) -> car1.getHorsepower() + car2.getHorsepower());
                        case 2 -> cars.sort(Comparator.comparingInt(Car::getHorsepower));
                        case 3 -> cars.sort(Comparator.comparingInt(car -> car.getEngine().cylinders));
                        case 4 -> cars.sort(Comparator.comparingInt(car -> car.getSteeringWheel().diameter));
                        case 5 -> System.exit(1);
                    }
                }
                case 5 -> System.exit(1);
            }
        }
    }
}
