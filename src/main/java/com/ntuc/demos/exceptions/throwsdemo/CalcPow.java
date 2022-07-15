package com.ntuc.demos.exceptions.throwsdemo;

/**
 *
 * @author Sridhar Guzzu
 */
public class CalcPow {
    public long pow(int n , int m) throws Exception{
        if(n==0 || m == 0)
            throw new Exception("input cant be zero");
        else if(n<0 || m<0)
            throw new Exception("Input cant be negative");
        else
            return (long)(Math.pow(n, m));
    }
}
