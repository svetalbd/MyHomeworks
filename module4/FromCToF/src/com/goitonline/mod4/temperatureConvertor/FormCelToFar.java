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
            System.out.println("Make your choice: 1 - convert from Celsius to  Farrengeyt; 2 - from Farrengeyt to Celcium; 3 - break.");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ConvertFromCToF convertFromCToF = new ConvertFromCToF();
                    double resultCF = convertFromCToF.getResultOfConvert();
                    System.out.printf("The temperature according to Farrengeyt is %.3f\n", resultCF);
                    break;
                case 2:
                    ConvertFromFToC convertFromFToC = new ConvertFromFToC();
                    double resultFC = convertFromFToC.getResultOfConvert();
                    System.out.printf("The temperature according to Celsius is %.3f\n", resultFC);
                    break;
                case 3:
                    exitValue = false;
                    break;
                default:
                    System.out.println("Unknown number");
                    break;
            }
        }
    }

}
