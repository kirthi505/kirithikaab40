package mypackage;

import java.util.Scanner;

public class UsingNonStaticMethods_Sc_8{
	 int a;
	 int b;
	 int sum;
   void add(int a,int b)
	{
		sum=a+b;
		System.out.println("the result is :" + sum);
	}
	 void sub(int a,int b)
	{
		sum=a-b;
		System.out.println("the result is :" + sum);
	}
     void mul(int a,int b)
    {
    	sum=a*b;
		System.out.println("the result is :" + sum);
    }
 void div(int a,int b)
  {
	  sum=a/b;
		System.out.println("the result is :" + sum);
	  
  }
  void mod(int a,int b)
  {
	  sum=a%b;
		System.out.println("the result is :" + sum);
	
  }

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first num");
		int a =s1.nextInt();
		System.out.println("enter the sec num");
		int b =s1.nextInt();
		UsingNonStaticMethods_Sc_8 u1=new UsingNonStaticMethods_Sc_8 u1();
		u1.add(a, b);
		u1.sub(a, b);
		u1.mul(a, b);
		u1.div(a, b);
	    u1.mod(a, b);
	s1.close();
	}
	private static void u1() {
		// TODO Auto-generated method stub
		
	}
	
}
	
