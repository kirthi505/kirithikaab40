package mypackage;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		while(n>0)
		{
			if(n%10==0)
			{
				System.out.println(n);
				break;
			}
			n--;
		}
		
	}

}
