package com.ravi.demo.hibernatedemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int a[]= {1,5,1,6,7};
        int d[]= new int[] {1,5,1,6,7};
        BaseBallCoach bc=new BaseBallCoach();
        System.out.println(bc.getDailyWorkout());
    }
}
