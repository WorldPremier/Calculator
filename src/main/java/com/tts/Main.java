package com.tts;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {

        Calculating cal = new Calculating();
        cal.setAdd(200+250);
        cal.setSubtraction(99-49);
        cal.setMultiplication(51*30);
        cal.setDivision(100/2);

        cal.getAdd();
        cal.getSubtraction();
        cal.getMultiplication();
        cal.getDivision();


        System.out.println(cal.getAdd());
        System.out.println(cal.getSubtraction());
        System.out.println(cal.getMultiplication());
        System.out.println(cal.getDivision());


        System.out.println("===== Cos =====");

            // get two double numbers
            double x = 45.0;
            double y = 180.0;

            // convert them to radians
            x = Math.toRadians(x);
            y = Math.toRadians(y);

            // print their cosine
            System.out.println("Math.cos(" + x + ")=" + Math.cos(x));
            System.out.println("Math.cos(" + y + ")=" + Math.cos(y));


        System.out.println("===== Tan =====");


        // get two double numbers numbers
        double a = 45;
        double b = -180;

        // convert them in radians
        x = Math.toRadians(a);
        y = Math.toRadians(b);

        // print the tangent of these doubles
        System.out.println("Math.tan(" + a + ")=" + Math.tan(a));
        System.out.println("Math.tan(" + b + ")=" + Math.tan(b));


        System.out.println("===== Pi && Degrees =====");


        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));

    }
}
