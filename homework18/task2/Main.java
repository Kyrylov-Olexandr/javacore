package javacore.homework18.task2;

public class Main {
    public static void main(String[] args) {
        MyEntry<String, Double> myEntry = new MyEntry<>();
        myEntry.add("Key 1", 7212d);
        myEntry.add("Key 2", 14441d);
        myEntry.add("Key 3", 5611d);
        myEntry.displayMap();
        myEntry.removeByKey("Key 3");
        myEntry.removeByValue(7212d);
        myEntry.displayKeys();
        myEntry.displayValues();
        myEntry.displayMap();
    }
}
