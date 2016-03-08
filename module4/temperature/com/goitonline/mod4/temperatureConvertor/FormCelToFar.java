package com.goitonline.mod4.temperatureConvertor;

import java.util.Scanner;

/**
 * Created by Сергей on 08.03.2016.
 */
public class FormCelToFar {

    public static void main (String[] args){
        System.out.println("Make your choice: 1 - convert from Celsius to  Farrengeyt; 2 - from Farrengeyt to Celcium; 3 - break.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ConvertFromCToF convertFromCToF = new ConvertFromCToF();
                double resultCF = convertFromCToF.getResultOfConvert();
                System.out.format("The temperature according to Farrengeyt is "+resultCF);
                System.exit(0);
            case 2:
                ConvertFromFToC convertFromFToC = new ConvertFromFToC();
                double resultFC = convertFromFToC.getResultOfConvert();
                System.out.format("The temperature according to Celsius is "+resultFC);
                System.exit(0);
            case 3:
                break;
        }
    }
}
