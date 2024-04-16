package mypackage;

import java.util.Scanner;

public class UsingNonStaticMethods_Sc {
	void add()
	{
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("enter the first num");
			int a =s1.nextInt();
			System.out.println("enter the second num");
			int b =s1.nextInt();
			int sum=a+b;
			System.out.println("the sum is :" + sum) ;
		}
	}
	void sub()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the first num");
		int a =s2.nextInt();
		System.out.println("enter the second num");
		int b =s2.nextInt();
		int sum=a-b;
		System.out.println("the sum is :" + sum) ;
		
	}
    void mul()
    {
    	try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("enter the first num");
			int a =s1.nextInt();
			System.out.println("enter the second num");
			int b =s1.nextInt();
			int sum=a*b;
			System.out.println("the sum is :" + sum) ;
		}
    }
  void div()
  {
	  try (Scanner s1 = new Scanner(System.in)) {
		System.out.println("enter the first num");
		int a =s1.nextInt();
		System.out.println("enter the second num");
		int b =s1.nextInt();
		int sum=a/b;
		System.out.println("the sum is :" + sum) ;
	}
  }
  void mod()
  {
	  Scanner s1=new Scanner(System.in);
		System.out.println("enter the first num");
		int a =s1.nextInt();
		System.out.println("enter the second num");
		int b =s1.nextInt();
		int sum=a%b;
		System.out.println("the sum is :" + sum) ;
  }


	public static void main(String[] args) 
	{
		UsingNonStaticMethods_Sc u1=new UsingNonStaticMethods_Sc();
		u1.add();
		u1.sub();
		u1.mul();
		u1.div();
		u1.mod();
	
	}
	
}
	

