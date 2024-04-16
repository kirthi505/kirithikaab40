package mypackage;

import java.util.Scanner;

public class Humaninp {
	
	
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);	
	System.out.println("enter the first num");
	int Firstno=s1.nextInt();
	System.out.println("enter the second num");
	int secnu=s1.nextInt();
	int sum=Firstno+secnu;
	System.out.println("the sum is :"+ sum);
	s1.close();

	}

}
