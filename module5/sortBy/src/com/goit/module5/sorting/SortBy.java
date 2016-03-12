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


         for (int z = 0; z < myMass.length - 1; z++) {
             for (int i = 0; i < myMass.length - 1; i++) {
                 if (myMass[i] > myMass[i + 1]) {
                     middleValue = myMass[i + 1];
                     myMass[i + 1] = myMass[i];
                     myMass[i] = middleValue;
                 }
             }
         }

         System.out.println("New sorted array: ");
         for (int j = 0; j < myMass.length; j++) {
             System.out.println(myMass[j]);
         }

     }
}
