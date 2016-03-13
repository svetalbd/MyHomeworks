package com.goitonline.module4.area;

import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Round {
    private double radiusOfRound;

    Round(){
        System.out.print("Enter a radius of a round, please. It must be a number value. \n");
        this.radiusOfRound = newInput() ;
    }

    public double getRadiusOfRound() {
        return radiusOfRound;
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
