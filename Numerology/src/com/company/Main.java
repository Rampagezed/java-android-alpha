package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int[] results = new int[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        List<Integer> mainList = intToList(number);

        for (int i = 0; i < mainList.size(); i++) {
            shortenList(mainList, i);
        }
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
//0 1006 0 286 0 1473 0 205 0 2070
//0 0 0 1625 0 1785 0 895 0 735
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

    public static int formula(int a, int b) {
        return (a + b) * (a ^ b) % 10;
    }

    public static void shortenList(List<Integer> listOrig, int position) {
        if (listOrig.size() == 1) {
            Integer myPosition = listOrig.get(position);
            results[myPosition]++;
        }
        if (position == listOrig.size() - 1) {
            return;
        }
        List<Integer> list = new ArrayList<>(listOrig);
        int x = formula(list.get(position), list.get(position) + 1);
        list.set(position, x);
        list.remove(position + 1);
        for (int i = 0; i < list.size(); i++) {
            shortenList(list, i);
        }
    }

}
