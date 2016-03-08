package com.goitonline.mod4.temperatureConvertor;

import java.util.Scanner;

/**
 * Created by Сергей on 08.03.2016.
 */
public class ConvertFromFToC {
    private double inputValue;
    private double resultOfConvert;

    ConvertFromFToC(){
        System.out.println("Input a temperature according to Farrengeyt. Use ',' to separate decimal.");
        Scanner sc = new Scanner(System.in);
        this.inputValue = sc.nextDouble();
        this.resultOfConvert =(this.inputValue-32d)*(5d/9d);
    }

    public double getResultOfConvert() {
        return resultOfConvert;
    }
}
