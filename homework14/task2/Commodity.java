package javacore.homework14.task2;

import java.util.*;

public class Commodity {

    public Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        products.add(product);
    }


    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
        System.out.println("Product added!");
    }

    public void changeProduct(String name, Product newProduct) {
        removeProduct(name);
        products.add(newProduct);
        System.out.println("Commodity changed!");
    }

    public void sortByName(){
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort((prod1, prod2) -> prod1.getName().compareTo(prod2.getName()));
        System.out.println(sortedList);

    }
    public void sortByLength(){
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort((prod1, prod2) -> (int) (prod1.getLength() - prod2.getLength()));
        System.out.println(sortedList);
    }
    public void sortByWeight() {
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort((prod1, prod2) -> (int) (prod1.getWeight() - prod2.getWeight()));
        System.out.println(sortedList);
    }
    public void sortByWidth() {
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort((prod1, prod2) -> (int) (prod1.getWidth() - prod2.getWidth()));
        System.out.println(sortedList);
    }
//
    public void selectProduct(String name) {
        boolean a = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            } else {
                a = true;
            }
        }
        if (a) {
            System.out.println("Not found!");
        }
    }


}
