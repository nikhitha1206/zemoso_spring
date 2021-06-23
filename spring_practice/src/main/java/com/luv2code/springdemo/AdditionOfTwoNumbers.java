package com.luv2code.springdemo;

public class AdditionOfTwoNumbers {
    private int num1;
    private int num2;
    public void startAdd()
    {
        System.out.println("started addition");
    }
    public void endAdd()
    {
        System.out.println("ended addition");
    }
    public void setNum1(String num1) {
        this.num1 = Integer.parseInt(num1);
    }

    public void setNum2(String num2) {
        this.num2 = Integer.parseInt(num2);
    }
    public int getResult()
    {
        return num1+num2;
    }
}
