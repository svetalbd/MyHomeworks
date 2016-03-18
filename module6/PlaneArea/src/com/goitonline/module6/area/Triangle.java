package com.goitonline.module6.area;

import java.util.*;

/**
 * Class Triangle reads values of length of triangle sides.
 *
 * Created by Mykhailenko Svitlana on 16.03.2016.
 */
public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;


    Triangle(){
        NewInput newInput = new NewInput();
        System.out.print("Enter the length of the first side of triangle, please. It must be a number value. \n");
        this.firstSide = newInput.inputValue ();
        System.out.print("Enter the length of the second side of triangle, please. It must be a number value. \n");
        this.secondSide =  newInput.inputValue ();
        System.out.print("Enter the length of third side of triangle, please. It must be a number value. \n");
        this.thirdSide = newInput.inputValue ();
    }

    /* Getter of the first side*/
    public double getFirstSide() {
        return firstSide;
    }

    /* Getter of the second side*/
    public double getSecondSide() {
        return secondSide;
    }

    /* Getter of the third side*/
    public double getThirdSide() {
        return thirdSide;
    }

    /* Convert input value to a double*/
   /* static double inputValue () {
        boolean correctValue = false;
        Double outputValue = 0d;

        while (correctValue == false) {
            String newString;
            Scanner sc = new Scanner(System.in);

            //Read firs word of input value (to space)
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
    */
}
