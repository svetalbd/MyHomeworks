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
                    System.out.print("Enter a length of rectangle, please. It must be a number value. \n");
                    double lengthOfRectangle = newInput() ;
                    rectangle.setLengthOfRectangle(lengthOfRectangle);
                    System.out.print("Enter a width of rectangle, please. It must be a number value. \n");
                    double widthOfRectangle = newInput();
                    rectangle.setWidthOfRectangle(widthOfRectangle);
                    double squareOfRectangle = rectangle.areaOfRectangle(rectangle.getLengthOfRectangle(),rectangle.getWidthOfRectangle());
                    System.out.format("The area of rectangle is %.3f\n", squareOfRectangle);
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    System.out.print("Input a lenght of the first side of triangle, please. It must be a number value. \n");
                    double firstSide = newInput () ;
                    triangle.setFirstSide(firstSide);
                    System.out.print("Input a lenght of the second side of triangle, please. It must be a number value. \n");
                    double secondSide =  newInput ();
                    triangle.setSecondSide(secondSide);
                    System.out.print("Input a third of the first side of triangle, please. It must be a number value. \n");
                    double thirdSide = newInput ();
                    triangle.setThirdSide(thirdSide);
                    double areaOfTriangle = triangle.areaOfTriangle(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide());
                    System.out.format("The area of triangle is %.3f\n",areaOfTriangle);
                    break;
                case 3:
                    Round round = new Round();
                    System.out.print("Enter a radius of a round, please. It must be a number value. \n");
                    double radiusOfRound = newInput() ;
                    round.setRadiusOfRound(radiusOfRound);
                    double areaOfRound = round.areaOfRound(round.getRadiusOfRound());
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
