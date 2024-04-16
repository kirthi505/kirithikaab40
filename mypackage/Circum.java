package mypackage;

import java.util.Scanner;

public class Circum {

	public static void main(String[] args)
	{
      final double pi=3.14;
      double circle=0;
      int r;
      Scanner s1=new Scanner(System.in);
      System.out.println("enter the circumference of circle :");
      r=s1.nextInt();
      circle=2*pi*r;
      System.out.println("the value is :" + circle);
      
      s1.close();
	}

}
