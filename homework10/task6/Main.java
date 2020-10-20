package javacore.homework10.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentences: ");
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] k = new int[] {-1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (!arr[k[1]].equals(arr[i]) || k[0] < 0) {
                int c = 1;
                for (int p = i + 1; p < arr.length; p++) {
                    if (arr[i].equals(arr[p])) {
                        c++;
                    }
                }
                if (k[0] < c) {
                    k[0] = c;
                    k[1] = i;
                };
            }
        }
        String word = arr[k[1]];
        System.out.println("The most common word in text is '" + word + "'");

    }

}
