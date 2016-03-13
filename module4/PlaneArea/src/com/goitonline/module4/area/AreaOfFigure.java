package com.goitonline.module4.area;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class AreaOfFigure {
    static boolean exitBreak = true;

    public static void main(String[] args){
        while (exitBreak) {
            System.out.println("Select a shape: 1 - rectangle, 2 - triangle, 3 - round, 4 - break.\n");
            Scanner scLength = new Scanner(System.in);
            int choise = scLength.nextInt();
            switch (choise) {
                case 1:
                    Rectangle rectangle = new Rectangle();
                    double squareOfRectangle = rectangle.getLengthOfRectangle() * rectangle.getWidthOfRectangle();
                    System.out.format("The area of rectangle is %.3f\n", squareOfRectangle);
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    double a = triangle.getFirstSide();
                    double b = triangle.getSecondSide();
                    double c = triangle.getThirdSide();
                    double p = a + b + c;
                    double areaOfTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.format("The area of triangle is %.3f\n",areaOfTriangle);
                    break;
                case 3:
                    Round round = new Round();
                    double areaOfRound = Math.PI * Math.pow(round.getRadiusOfRound(), 2);
                    System.out.format("The area of round is %.3f\n", areaOfRound);
                    break;
                case 4:
                    exitBreak = false;
                    break;
                default:
                    System.out.println("Unknown number \n");
                    break;
            }
        }

    }
}
