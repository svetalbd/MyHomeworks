package com.goitonline.module5.minmax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * MinMaxFinder finds minimal and maximal value of input array
 *
 * Created by Mykhailenko Svitlana on 16/03/2016
 */

public class MinMaxFinder {
    private static final int ARRAY_LONG = 5;
    static int[] myMass = new int[ARRAY_LONG];


    public static void main(String[] args) {
        Boolean correctValue = false;

        System.out.println("Enter 5 numbers using 'Enter': ");

        //input numbers from console
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < myMass.length; i++) {

            correctValue = false;

            while (correctValue == false) {
                try {
                    myMass[i] = Integer.parseInt(str.readLine());
                    correctValue = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error! Input " + (i + 1) + " element of array. It must be an integer number.\n");
                } catch (IOException e){
                    System.out.println("Something was wrong!!!\n");
                }
            }
        }

        System.out.format("Minimum value of array is: " + getMinValue(myMass) + "\n");
        System.out.format("Maximum value of array is: " + getMaxValue(myMass) + "\n");
    }


   /* Find minimal value */
    private static int getMinValue(int[] myArray) {
        int minValue;

        minValue = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (minValue >= myArray[i + 1]) {
                minValue = myArray[i + 1];
            }
        }
        return minValue;
    }

    /* Find maximal value */
    private static int getMaxValue(int[] myArray) {
        int maxValue;

        maxValue = myArray[0];
        for (int i = 0; i <myArray.length - 1; i++) {
            if (maxValue < myArray[i + 1]) {
                maxValue = myArray[i + 1];
            }
        }
        return maxValue;
    }

}
