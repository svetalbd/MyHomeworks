package com.goitonline.module4.area;

import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Round {
    private double radiusOfRound;


    public void setRadiusOfRound(double radiusOfRound) {
        this.radiusOfRound = radiusOfRound;
    }

    public double getRadiusOfRound() {
        return radiusOfRound;
    }


    public static double areaOfRound (double radius){
        double area;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
