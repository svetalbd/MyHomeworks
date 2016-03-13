package com.goitonline.module4.area;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Rectangle {
    private double lengthOfRectangle;
    private double widthOfRectangle;

    Rectangle(){

        System.out.print("Enter a length of rectangle, please. It must be a number value. \n");
        this.lengthOfRectangle = newInput() ;
        System.out.print("Enter a width of rectangle, please. It must be a number value. \n");
        this.widthOfRectangle = newInput();
    }

    public double getLengthOfRectangle() {
        return lengthOfRectangle;
    }

    public double getWidthOfRectangle() {
        return widthOfRectangle;
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
