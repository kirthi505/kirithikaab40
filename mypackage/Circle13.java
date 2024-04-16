package mypackage;

import java.util.Scanner;

public class Circle13{
	
	public static void main(String[] args)
	{
		

		   
		        final double PI = 3.14; // Use the constant value of PI from Math library

		        int radius;// Assuming a constant radius for this example
                Scanner s1=new Scanner(System.in);
               // System.out.println("enter the radius value:");
               // radius=s1.nextInt();
		        // Loop to print the area 10 times
		        for (int i = 0; i < 10; i++)
		        {
		        	 System.out.println("enter the radius value:");
		                radius=s1.nextInt();
		            double area = PI * radius * radius;
		            System.out.println("Area of circle "  + area);
		        }
		        s1.close();
		    }
		}

