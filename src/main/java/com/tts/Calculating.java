package com.tts;

public class Calculating {

    public Calculating(){
        add = 0;
        subtraction = 0;
        multiplication = 0;
        division = 0;
    }

    private int add;
    private int subtraction;
    private int multiplication;
    private int division;

    public Calculating(int add, int subtraction, int multiplication, int division){

        this.add = add;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(int subtraction) {
        this.subtraction = subtraction;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }



    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public int division(int num1, int num2){
        return num1 / num2;
    }
}
