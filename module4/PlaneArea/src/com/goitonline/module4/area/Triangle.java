package com.goitonline.module4.area;

import java.util.*;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;


    Triangle(){
        System.out.print("Input a lenght of the first side of triangle, please. It must be a number value. \n");
        this.firstSide = newInput () ;
        System.out.print("Input a lenght of the second side of triangle, please. It must be a number value. \n");
        this.secondSide =  newInput ();
        System.out.print("Input a third of the first side of triangle, please. It must be a number value. \n");
        this.thirdSide = newInput ();
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    static double newInput () {
        String newString;
        Scanner sc = new Scanner(System.in);

        String phrase = sc.next();
        String delims = "[ ]+";
        String[] tokens = phrase.split(delims);

        if (tokens[0].contains(",")) {
            newString = tokens[0].replace(',', '.');
        } else newString = tokens[0];
        Double outputValue = Double.parseDouble(newString);
        return outputValue;
    }
}
