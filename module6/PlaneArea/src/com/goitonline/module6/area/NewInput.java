package com.goitonline.module6.area;

import java.util.Scanner;

/**
 * Class NewInput reads input value and convert it to double.
 *
 * Created by Mykhailenko Svitlana on 16.03.2016.
 */
public class NewInput {

    /* Convert input value to a double*/
    static double inputValue () {
        boolean correctValue = false;
        Double outputValue = 0d;

        while (correctValue == false) {
            String newString;
            Scanner sc = new Scanner(System.in);

            //Read first word of input value (to space)
            String phrase = sc.next();
            String delims = "[ ]+";
            String[] tokens = phrase.split(delims);

            //replace comma to dot
            if (tokens[0].contains(",")) {
                newString = tokens[0].replace(',', '.');
            } else newString = tokens[0];

            //convert into double
            try {
                outputValue = Double.parseDouble(newString);
                correctValue = true;
            }catch (NumberFormatException e){
                System.out.printf("ERROR: Input a number, please!\n");
            }
        }
        return outputValue;
    }
}
