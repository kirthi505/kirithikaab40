package mypackage;

import java.util.Scanner;

public class SwitchPrac {

	public static void main(String[] args)
	{
		int x,y,z;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the 2 numbers");
	   x=s.nextInt();
	   y=s.nextInt();
	   s.nextLine();
	  System.out.println("enter the operation");
	String oper=s.nextLine();
	  switch(oper)
	  {
	  case "add":
		 z = x+y;
    	  System.out.println(z);
    	  break;
	  case "sub":
		  z= x-y;
    	  System.out.println(z);
    	  break;
	  case "mul":
		  z=x*y;
    	  System.out.println(z);
    	  break;
	  case "div":
		  z=x/y;
    	  System.out.println(z);
    	  break;
	  default :
    	  System.out.println("invalid");
    	  break;
	  }

	}

}
