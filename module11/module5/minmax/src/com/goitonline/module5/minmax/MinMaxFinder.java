package com.goitonline.module5.minmax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Сергей on 11.03.2016.
 */
public class MinMaxFinder {
    static int[] myMass = new int[5];
    static int minValue;
    static int maxValue;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter 5 numbers using 'Enter': ");
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = Integer.parseInt(str.readLine());
        }


        minValue = findMinValue(myMass);

        System.out.format("Minimum value of array is: "+minValue+"\n" );

        maxValue = findMaxValue(myMass);

        System.out.format("Maximum value of array is: "+maxValue+"\n");

    }

    public static int findMinValue (int[] array){
        int result;
        result = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (result>=array[i+1]){
                result = array[i+1];
            }
        }
        return result;
    }

    public static int findMaxValue (int[] array){
        int result;
        result = array[0];
        for (int i = 0; i < array.length-1; i++){
            if (result<array[i+1]){
                result = array [i+1];
            }
        }

        return result;
    }

}
