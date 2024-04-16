package mypackage;

import java.util.Scanner;

public class ForLoop_Sc {
	
	 int i;
	static int n;
	 
	
	static void add() throws InterruptedException
	{
		for(int i= n ;i<10; i++)
		{
			System.out.println("the iteration is : " + i);
			//Thread.sleep(3000);
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s1.nextInt();
	add();
	s1.close();

	}

}
