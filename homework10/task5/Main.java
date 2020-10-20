package javacore.homework10.task5;

import java.util.Scanner;

public class Main {

     static String theMostCommonWord (String str) {

        String[] arr = str.split(" ");
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
                }
            }
        }
        String word = arr[k[1]];
        return word;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentences: ");
        String input = scanner.nextLine();
        String[] sentences = input.split("[.!?]");
        for (int i = 0; i < sentences.length; i++) {
            System.out.println("The most common word in sentence " + (i + 1) + " is '" + Main.theMostCommonWord(sentences[i]) + "'");
        }

    }

}
