package com.goitonline.module4.area;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class AreaOfFigure {
    public static void main(String[] args){
        System.out.println("Select a shape: 1 - rectangle, 2 - triangle, 3 - round, 4 - break.");
        Scanner scLength= new Scanner(System.in);
        int choise = scLength.nextInt();
        switch (choise){
            case 1:
                Rectangle rectangle = new Rectangle();
                double squareOfRectangle = rectangle.getLengthOfRectangle()*rectangle.getWidthOfRectangle();
                System.out.format("The area of rectangle is "+squareOfRectangle);
                break;
            case 2:
                Triangle triangle = new Triangle();
                double a = triangle.getFirstSide();
                double b = triangle.getSecondSide();
                double c = triangle.getThirdSide();
                double p = a+b+c;
                double areaOfTriangle= Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.format("The area of triangle is "+areaOfTriangle);
                break;
            case 3:
                Round round = new Round();
                double areaOfRound = Math.PI*Math.pow(round.getRadiusOfRound(),2);
                System.out.format("The area of round is "+areaOfRound);
                break;
            case 4:
                break;
            default:
                System.out.println("Unknown number ");
                break;
        }

    }
}
