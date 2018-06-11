package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        List<Integer> mainList = intToList(number);
        System.out.println(mainList);
    }

    public static List<Integer> intToList(int n) {
        List<Integer> result = new ArrayList<Integer>();
        while (n != 0) {
            int x = n % 10;
            result.add(0,x);
            n = n / 10;
        }
        return result;
    }
}
