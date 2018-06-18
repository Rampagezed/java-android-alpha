package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();

        int numsArray[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numsArray[i] = in.nextInt();
        }


        int tempCount = 1;
        int maxCount = 1;


        for (int i = 0; i < arraySize - 1; i++) {
            if (numsArray[i] < numsArray[i + 1]) {
                tempCount++;
            } else {
                tempCount = 1;
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
            }
        }

        System.out.println(maxCount);

    }
}
