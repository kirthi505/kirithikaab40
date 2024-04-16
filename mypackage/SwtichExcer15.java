package mypackage;

import java.util.Scanner;

public class SwtichExcer15 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the day:");
		int day=s.nextInt();
		switch(day)
		{
		case 1:
	    	  System.out.println("print 1");
	    	  break;
		case 2:
	    	  System.out.println("print 2");
	    	  break;
		case 3:
	    	  System.out.println("print 3");
	    	  break;
		case 4:
	    	  System.out.println("print 4");
	    	  break;
		default:
	    	  System.out.println("default");
	    	  break;
		}
		

	}

}
