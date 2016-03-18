package com.goitonline.module6.area;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Class Rectangle reads values of length and width of rectangle's sides.
 *
 * Created by Mykhailenko Svitlana on 16.03.2016.
 */
public class Rectangle {
    NewInput newInput = new NewInput();
    private double lengthOfRectangle;
    private double widthOfRectangle;

    Rectangle(){

        System.out.print("Enter a length of rectangle, please. It must be a number value. \n");
        this.lengthOfRectangle = newInput.inputValue() ;
        System.out.print("Enter a width of rectangle, please. It must be a number value. \n");
        this.widthOfRectangle = newInput.inputValue();
    }

    public double getLengthOfRectangle() {
        return lengthOfRectangle;
    }

    public double getWidthOfRectangle() {
        return widthOfRectangle;
    }

}
