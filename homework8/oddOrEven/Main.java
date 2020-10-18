package homework8.oddOrEven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String strInput = scanner.nextLine();
            float intInput = Float.parseFloat(strInput);

            if (intInput % 1 != 0) System.out.println("Error! Not an integer!");
        }
    }
}
