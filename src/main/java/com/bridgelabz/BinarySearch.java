package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch BinarySearch = new BinarySearch();
        Scanner Scanner = new Scanner(System.in);
        String[] List = {"my", "name", "is", "a", "amit"};
        Arrays.sort(List);
        System.out.println(Arrays.toString(List));
        System.out.println("which word do u want just enter now");
        String searchWords = Scanner.nextLine();
        Scanner.close();
        int result = BinarySearch.binarySearch(List, searchWords);

        if (result == -1)
            System.out.println("wrong words");

        System.out.println("Given word is found at" + " " + result);
    }

    public int binarySearch(String[] List, String searchWords) {
        int start = 0, end = List.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int result = searchWords.compareTo(List[middle]);
            if (result == 0)
                return middle;
            if (result > 0) {
                start = middle + 1;
            } else
                end = middle - 1;

        }
        return -1;
    }

}


