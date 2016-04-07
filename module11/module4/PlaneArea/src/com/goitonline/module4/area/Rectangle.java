package com.goitonline.module4.area;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Rectangle {
    private double lengthOfRectangle;
    private double widthOfRectangle;


    public void setLengthOfRectangle(double lengthOfRectangle) {
        this.lengthOfRectangle = lengthOfRectangle;
    }

    public void setWidthOfRectangle(double widthOfRectangle) {
        this.widthOfRectangle = widthOfRectangle;
    }

    public double getLengthOfRectangle() {
        return lengthOfRectangle;
    }

    public double getWidthOfRectangle() {
        return widthOfRectangle;
    }

    public static double areaOfRectangle (double length, double width) {
        double area;
        area = length*width;
        return area;
    }
}
