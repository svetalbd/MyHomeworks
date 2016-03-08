package com.goitonline.module4.area;

import java.util.*;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(){
        System.out.print("Input a lenght of the first side of triangle, please. It must be a number value. Separate with','");
        Scanner firsS= new Scanner(System.in);
        this.firstSide = firsS.nextDouble() ;
        System.out.print("Input a lenght of the second side of triangle, please. It must be a number value. Separate with','");
        Scanner secondS= new Scanner(System.in);
        this.secondSide =  secondS.nextDouble();
        System.out.print("Input a third of the first side of triangle, please. It must be a number value. Separate with','");
        Scanner thirdS= new Scanner(System.in);
        this.thirdSide = thirdS.nextDouble();
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
}
