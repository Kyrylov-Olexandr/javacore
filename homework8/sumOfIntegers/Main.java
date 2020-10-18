package homework8.sumOfIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String a = scanner.nextLine();
            if (a.equals("q")) break;
            String b = scanner.nextLine();
            if (b.equals("q")) break;
            System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
        }
    }
}

