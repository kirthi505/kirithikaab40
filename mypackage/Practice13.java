package mypackage;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) 
	{
		double sum=0.0;
		Scanner s3 =new Scanner(System.in);
		System.out.println("enetr the number :");
		while(true)
		{
			double n=s3.nextDouble();
			if(n<0.0)
			{
				break;
			}
				
		
			sum=sum+n;
			
		}
		System.out.println(sum);

	}

}
