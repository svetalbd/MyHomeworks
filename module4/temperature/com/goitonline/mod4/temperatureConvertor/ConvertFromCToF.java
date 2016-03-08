package com.goitonline.mod4.temperatureConvertor;

import java.util.Scanner;

/**
 * Created by Сергей on 08.03.2016.
 */
public class ConvertFromCToF {
    private double inputValue;
    private double resultOfConvert;

    ConvertFromCToF(){
        System.out.println("Input a temperature according to Celsius. Use ',' to separate decimal.");
        Scanner sc = new Scanner(System.in);
        this.inputValue = sc.nextDouble();
        this.resultOfConvert = this.inputValue*9d/5d+32d ;
    }

    public double getResultOfConvert() {
        return resultOfConvert;
    }
}
