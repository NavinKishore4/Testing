package com.gradedproject.q2;
import java.util.*;
public class Main {
    //creating a static method for the values
    public static int pow(int x,int n)
    {
        //setting the stop condition for recursive
        if(n==0)
        {
            return 1;
        }
        //recursion happens and returning the value
        return (x*pow(x,n-1));
    }
    public static void main(String[] args)
    {
        //using scanner class to get input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number X:");
        //getting x value from the user
        int x=sc.nextInt();
        System.out.println("Enter the power N =");
        //getting n value from the user
        int n=sc.nextInt();
        //calling and printing the method
        System.out.println(pow(x,n));



    }
}
