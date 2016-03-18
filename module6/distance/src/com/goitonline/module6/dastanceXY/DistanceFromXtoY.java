package com.goitonline.module4.dastanceXY;

import com.sun.deploy.net.proxy.StaticProxyManager;

import java.util.Scanner;

/**
 * DistanceFromXtoY compute distance between two points in Euclidean space
 *
 * Created by Mykhailenko Svitlana on 16/03/2016
 *
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

        //Distance formula
        double result = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),1d/2d);

        System.out.format("The distance between 2 points (%.2f; %.2f):(%.2f; %.2f) is %.3f\n",x1, y1, x2, y2,result);
    }

    static double newInput (){

        Double outputValue = 0d;
        Boolean correctValue = false;

        //loop runs until the valid value is entered
        while (correctValue == false) {
            Scanner sc = new Scanner(System.in);
            String phrase = sc.next();
            //read all values in array
            String delims = "[ ]+";
            String[] tokens = phrase.split(delims);

           //read first value and replace ',' on '.'
            if (tokens[0].contains(",")) {
                newString = tokens[0].replace(',', '.');
            } else newString = tokens[0];

            try {
                outputValue = Double.parseDouble(newString);
                correctValue = true;
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: The input value must be a number! Try again to input correct value.");
            }
        }
        return outputValue;
    }

}


