package com.goitonline.module4.area;

import java.util.Scanner;

/**
 * Created by Сергей on 07.03.2016.
 */
public class Round {
    private double radiusOfRound;

    Round(){
        System.out.print("Enter a radius of a round, please. It must be a number value. Separate with','");
        Scanner scLength= new Scanner(System.in);
        this.radiusOfRound = scLength.nextDouble() ;
    }

    public double getRadiusOfRound() {
        return radiusOfRound;
    }
}
