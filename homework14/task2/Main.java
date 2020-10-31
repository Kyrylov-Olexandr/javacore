package javacore.homework14.task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Commodity commodity = new Commodity();
        commodity.addProduct(new Product("Mouse", 6.5f, 10, 0.15f));
        commodity.addProduct(new Product("Monitor", 30, 50.5f, 2.5f));
        commodity.addProduct(new Product("Keyboard", 12, 35.4f, 0.5f));
        commodity.addProduct(new Product("Webcam", 2, 5.5f, 0.1f));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "MENU:\n" +
                            "1) Add product\n" +
                            "2) Remove product\n" +
                            "3) Change product\n" +
                            "4) Sort by name\n" +
                            "5) Sort by length\n" +
                            "6) Sort by width\n" +
                            "7) Sort by weight\n" +
                            "8) Select product\n" +
                            "9) EXIT"
            );
            System.out.println("Available commodity:\n" + commodity.products);
            String menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("Enter product values separated by commas (name,width,length,weight):");
                    menu = scanner.nextLine();
                    String[] prodValues = menu.split(",");
                    commodity.addProduct(new Product(
                            prodValues[0],
                            Float.parseFloat(prodValues[1]),
                            Float.parseFloat(prodValues[2]),
                            Float.parseFloat(prodValues[3])
                    ));
                    System.out.println(commodity.products);
                    break;
                case "2":
                    System.out.println("Enter product name:");
                    menu = scanner.nextLine();
                    commodity.removeProduct(menu);
                    System.out.println(commodity.products);
                    break;
                case "3":
                    System.out.println("Enter the name of the product you want to change:");
                    menu = scanner.nextLine();
                    System.out.println("Enter new product values separated by commas (name,width,length,weight):");
                    String newProduct = scanner.nextLine();
                    String[] newProductValues = newProduct.split(",");
                    commodity.changeProduct(menu, new Product(
                            newProductValues[0],
                            Float.parseFloat(newProductValues[1]),
                            Float.parseFloat(newProductValues[2]),
                            Float.parseFloat(newProductValues[3])
                    ));
                    break;
                case "4":
                    commodity.sortByName();
                    break;
                case "5":
                    commodity.sortByLength();
                    break;
                case "6":
                    commodity.sortByWidth();
                    break;
                case "7":
                    commodity.sortByWeight();
                    break;
                case "8":
                    System.out.println("Enter product name:");
                    menu = scanner.nextLine();
                    commodity.selectProduct(menu);
                    break;
                case "9":
                    System.exit(1);
                    break;
            }
        }


    }

}
