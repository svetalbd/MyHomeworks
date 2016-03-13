package com.goitonline.mod4.temperatureConvertor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Сергей on 08.03.2016.
 */
public class ConvertFromFToC {
    private double inputValue;
    private double resultOfConvert;

    ConvertFromFToC(){
        String newString;
        System.out.println("Input a temperature according to Farrengeyt. Use ',' to separate decimal.");
        Scanner sc = new Scanner(System.in);

        String phrase = sc.next();
        String delims = "[ ]+";
        String[] tokens = phrase.split(delims);

        if (tokens[0].contains(",")) {
            newString = tokens[0].replace(',', '.');
        }
        else newString = tokens[0];

        this.inputValue =  Double.parseDouble(newString);

        this.resultOfConvert =(this.inputValue-32d)*(5d/9d);
    }

    public double getResultOfConvert() {
        return resultOfConvert;
    }

}
