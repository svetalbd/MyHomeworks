package com.goit.module5.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

/**
 * Sort array by Bubble (I think) method
 *
 * Created by Mykhailenko Svitlana on 16.03.2016.
 */
public class SortBy {

    final static int LONG_MATH = 6;
    static int[] myMass = new int[LONG_MATH];
    static int middleValue;
    static boolean correctValue = false;

     public static void main(String[] args) {
         out.println("Enter 6 numbers using 'Enter': ");
         try {
             //read value from console
             BufferedReader str = new BufferedReader(new InputStreamReader(in));
             for (int i = 0; i < myMass.length; i++) {
                 correctValue = false;
                 while (correctValue == false) {
                     try {
                         myMass[i] = Integer.parseInt(str.readLine());
                         correctValue = true;
                     } catch (NumberFormatException e) {
                         System.out.println("ERROR: Input the  " +(i + 1) + " element of array.");
                     }
                 }
             }
         }catch(IOException e1){
             System.out.println("ERROR: Something was wrong.");
         }

         //sort array
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
