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

    }
}
