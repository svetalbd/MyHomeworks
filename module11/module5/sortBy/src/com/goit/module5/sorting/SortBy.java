package com.goit.module5.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

/**
 * Created by Сергей on 11.03.2016.
 */
public class SortBy {

    static int[] myMass = new int[6];
    static int middleValue;

     public static void main(String[] args) throws IOException {
         out.println("Enter 6 numbers using 'Enter': ");
         BufferedReader str = new BufferedReader(new InputStreamReader(in));
         for (int i = 0; i < myMass.length; i++) {
             myMass[i] = Integer.parseInt(str.readLine());
         }

         int[] sortedArray = sortArray(myMass);

         System.out.println("New sorted array: ");
         for (int j = 0; j < sortedArray.length; j++) {
             System.out.println(sortedArray[j]);
         }

     }

    public static int[] sortArray(int[] arrayToSort){

        for (int z = 0; z < arrayToSort.length - 1; z++) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    middleValue = arrayToSort[i + 1];
                    arrayToSort[i + 1] = arrayToSort[i];
                    arrayToSort[i] = middleValue;
                }
            }
        }
        return arrayToSort;
    }
}
