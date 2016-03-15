package com.goitonline.mod4.temperatureConvertor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Сергей on 08.03.2016.
 */
public class FormCelToFar {
    static boolean exitValue = true;

    public static void main (String[] args){
        while (exitValue) {
            System.out.println("\nMake your choice: 1 - convert from Celsius to  Farrengeyt; 2 - from Farrengeyt to Celcium; 3 - break.");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
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

    private static double readValue (){
        String newString;
        Double value;

        System.out.println("Input a temperature you need to convert: \n");
        Scanner sc = new Scanner(System.in);

        String phrase = sc.next();
        String delims = "[ ]+";
        String[] tokens = phrase.split(delims);

        if (tokens[0].contains(",")) {
            newString = tokens[0].replace(',', '.');
        }
        else newString = tokens[0];

        value =  Double.parseDouble(newString);
        return value;
    }


}
