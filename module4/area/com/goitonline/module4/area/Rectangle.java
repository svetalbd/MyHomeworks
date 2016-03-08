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

        System.out.print("Enter a length of rectangle, please. It must be a number value. Separate with','");
        Scanner scLength= new Scanner(System.in);
        this.lengthOfRectangle = scLength.nextDouble() ;
        System.out.print("Enter a width of rectangle, please. It must be a number value. Separate with','");
        Scanner scWidth= new Scanner(System.in);
        this.widthOfRectangle = scWidth.nextDouble();
    }

    public double getLengthOfRectangle() {
        return lengthOfRectangle;
    }

    public double getWidthOfRectangle() {
        return widthOfRectangle;
    }
}
