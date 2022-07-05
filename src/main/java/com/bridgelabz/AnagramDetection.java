package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element for word1");
        String word1 = scanner.nextLine();
        System.out.println("Enter the element for word2");
        String word2 = scanner.nextLine();
        char condition1[] = word1.toCharArray();
        char condition2[] = word2.toCharArray();
        Arrays.sort(condition1);
        Arrays.sort(condition2);
        boolean result = Arrays.equals(condition1,condition2);
        if (result == true) {
            System.out.println("This is the Anagram");
        } else {
            System.out.println("This is Not Anagram");
        }
    }
}
