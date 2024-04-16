package mypackage;

import java.util.Scanner;

public class Scanner_1 {

	
	public static void main(String[] args) 
	{
		final double pi=3.14;
		double area;
		int r;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the radius value: ");
	r=s1.nextInt();
	area=pi*r*r;
	System.out.println("this is the area of a circle:" +area);
	s1.close();

	}

}
