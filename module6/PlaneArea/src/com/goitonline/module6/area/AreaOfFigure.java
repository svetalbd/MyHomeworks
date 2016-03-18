package com.goitonline.module6.area;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class AreaOfFigure counts area of triangle, rectangle or round.
 *
 * Created by Mykhailenko Svitlana on 16.03.2016.
 */
public class AreaOfFigure {
    static boolean exitBreak = true;
    static boolean correctValue = false;

    public static void main(String[] args){
        int choise = 0;

        while (exitBreak) {
            correctValue = false;
            while (correctValue == false) {
                System.out.println("Select a shape: 1 - rectangle, 2 - triangle, 3 - round, 4 - break.\n");
                try {
                    Scanner scLength = new Scanner(System.in);
                    choise = scLength.nextInt();
                    correctValue = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: input an INTEGER value!");
                }
            }

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
                    System.out.format("Wrong number %d\n",choise);
                    break;
                }
        }

    }
}
