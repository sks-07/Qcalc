package com.crio.qcalc;

public class StandardCalculator {
    protected double result;
    public double getResult() {
        return result;
    }
    public void setResult(double val){
        if (val != 0)
           return;
        this.result=val;
    }
    public void clearResult(){
        result=0;
    }
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void printResult(){
        System.out.println("Standard Calculator Result:"+result);
    }


    public final void add(double num1, double num2){
        result= num1+num2;
        if(result==Double.MAX_VALUE || result == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
        //setResult(result);
    }
    public final void subtract(double num1, double num2){
        result= num1-num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void multiply(double num1, double num2){
        result= num1*num2;
        if(result==Double.MAX_VALUE || result == Double.POSITIVE_INFINITY || result==Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    public final void divide(double a , double b){
        
        if(b==0.0){
            throw new ArithmeticException("Divide By Zero");
        }
        result= a / b;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) ||(result == Double.MIN_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
}
