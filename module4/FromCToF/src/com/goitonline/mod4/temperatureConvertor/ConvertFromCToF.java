package com.goitonline.mod4.temperatureConvertor;

import java.util.Scanner;

/**
 * Created by Сергей on 08.03.2016.
 */
public class ConvertFromCToF {
    private double inputValue;
    private double resultOfConvert;
    String newString;

    ConvertFromCToF(){
        System.out.println("Input a temperature according to Celsius. Use ',' to separate decimal.");
        Scanner sc = new Scanner(System.in);

        String phrase = sc.next();
        String delims = "[ ]+";
        String[] tokens = phrase.split(delims);

        if (tokens[0].contains(",")) {
            newString = tokens[0].replace(',', '.');
        }
        else newString = tokens[0];

        this.inputValue =  Double.parseDouble(newString);

        this.resultOfConvert = this.inputValue*9d/5d+32d ;
    }

    public double getResultOfConvert() {
        return resultOfConvert;
    }
}
