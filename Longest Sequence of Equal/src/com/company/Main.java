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

        int tempCounter = 1;
        int maxCount = 1;


        for (int i = 1; i < arraySize; i++) {
            if (numsArray[i] == numsArray[i - 1]) {
                tempCounter++;
            } else {
                tempCounter = 1;
            }

            if (tempCounter > maxCount) {
                maxCount = tempCounter;
            }


        }




        System.out.println(maxCount);

    }


}

