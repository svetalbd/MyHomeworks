package com.goitonline.module4.area;

import java.util.*;

/**
 * Created by Сергей on 07.03.2016.
 */

public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;


    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
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


    public static double areaOfTriangle (double firstSide, double secondSide, double thirdSide){
        double area;
        double a = firstSide;
        double b = secondSide;
        double c = thirdSide;

        double p = a + b + c;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
}
