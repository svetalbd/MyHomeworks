package com.goitonline.module4.dastanceXY;

import java.util.Scanner;

/**
 * Created by Сергей on 08.03.2016.
 */
public class DistanceFromXtoY {

    public static void main (String[] args){
        System.out.println("Enter x-coordinate of the first point X1 using ',' for decimal ");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        System.out.println("Enter y-coordinate of the first point Y1 using ',' for decimal ");
        double y1 = sc.nextDouble();
        System.out.println("Enter x-coordinate of the second point X2 using ',' for decimal ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y-coordinate of the second point Y2 using ',' for decimal ");
        double y2 = sc.nextDouble();
        double result = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),1d/2d);
        System.out.format("The distance between 2 points (x1, y1):(x2, y2) is "+result);
    }
}
