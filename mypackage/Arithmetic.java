package mypackage;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args)
	{
	float b;
	float h;
	float area;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the base and height");
	b=s.nextFloat();
	h=s.nextFloat();
	
	area=(b*h)/2;
	System.out.println("the arae of the circle is "+ area);
		

	}

}
