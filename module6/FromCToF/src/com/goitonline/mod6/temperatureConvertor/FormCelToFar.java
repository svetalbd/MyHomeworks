package com.goitonline.mod6.temperatureConvertor;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * From CelToFar converts temperature from Celsius scale Fahrenheit scale, and vice versa
 *
 * Created by Mykhailenko Svitlana on 16/03/2016
 */

public class FormCelToFar {

    //check if Exit is chosen
    static boolean exitValue = true;

    public static void main (String[] args){
        int choice = 0;

        while (exitValue) {
            System.out.println("\nMake your choice: 1 - convert from Celsius to  Farrengeyt; " +
                    "2 - from Farrengeyt to Celcium; 3 - break.");

            Scanner sc = new Scanner(System.in);

            //check the correct value input
            try {
                choice = sc.nextInt();
            } catch ( InputMismatchException e){
                System.out.println("ERROR: The input value must be a number! Tru again, please.\n");
            }

            switch (choice) {
                case 1:
                    double resultCF = readValue()*9d/5d+32d;
                    System.out.printf("The temperature according to Farrengeyt is %.3f\n", resultCF);
                    break;
                case 2:
                    double resultFC = (readValue()-32d)*(5d/9d);
                    System.out.printf("The temperature according to Celsius is %.3f\n", resultFC);
                    break;
                case 3:
                    exitValue = false;
                    break;
                default:
                    System.out.println("Unknown number\n");
                    break;
            }
        }
    }

    /* Reading of input value*/
    private static double readValue (){

        String newString;
        Double value = 0d;
        Boolean correctInput = false;

        while (correctInput == false) {
            System.out.println("Input a temperature you need to convert: \n");

            Scanner sc = new Scanner(System.in);
            //read array of symbols
            String phrase = sc.next();
            //take the first word to space
            String delims = "[ ]+";
            String[] tokens = phrase.split(delims);

            //the first value is checked for a comma
            if (tokens[0].contains(",")) {
                //comma replace to dot
                newString = tokens[0].replace(',', '.');
            } else newString = tokens[0];

            try {
                value = Double.parseDouble(newString);
                correctInput = true;
            } catch (IllegalArgumentException e){
                System.out.println("ERROR: The input value must be a number! Tru again, please.\n");
            }
        }
        return value;
    }


}
