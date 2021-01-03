package javacore.homework8.odd_or_even;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number (enter Q to exit): ");
            String strInput = scanner.nextLine();
            if (strInput.equals("Q")) {
                System.out.println("Program closed");
                break;
            } else {
                float intInput = Float.parseFloat(strInput);
                System.out.println((intInput % 1 == 0 ? (intInput % 2 == 0 ? "ODD" : "EVEN") : "Error! Not an integer! (enter Q to exit)"));
            }
        }
    }
}
