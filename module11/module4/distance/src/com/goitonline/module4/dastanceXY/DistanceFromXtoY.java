package com.goitonline.module4.dastanceXY;

import java.util.Scanner;

/**
 * Created by Сергей on 08.03.2016.
 */
public class DistanceFromXtoY {
   static String newString;

    public static void main (String[] args){

        System.out.println("Enter x-coordinate of the first point X1");
        double x1 = newInput();

        System.out.println("Enter y-coordinate of the first point Y1");
        double y1 = newInput();

        System.out.println("Enter x-coordinate of the second point X2");
        double x2 = newInput();

        System.out.println("Enter y-coordinate of the second point Y2");
        double y2 = newInput();

        double result = distanceBetweenTwoPoints(x1, x2, y1, y2);

        System.out.format("The distance between 2 points (%.2f; %.2f):(%.2f; %.2f) is %.3f\n",x1, y1, x2, y2,result);
    }

    public static double distanceBetweenTwoPoints (double x1, double x2, double y1, double y2) {
        double result;

        result = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),1d/2d);

        return result;
    }



    static double newInput (){
        Scanner sc = new Scanner(System.in);

        String phrase = sc.next();
        String delims = "[ ]+";
        String[] tokens = phrase.split(delims);

        if (tokens[0].contains(",")) {
            newString = tokens[0].replace(',', '.');
        }
        else newString = tokens[0];
        Double outputValue = Double.parseDouble(newString);
        return outputValue;
    }
}


