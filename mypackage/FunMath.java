package mypackage;

public class FunMath {
	//find min/max using math functions

	public static void main(String[] args)
	{

int num1=20;
int  num2 =30;
int maxnum=Math.max(num1, num2);
double num3=30.0;
double num4=50.0;
double maxnum1=Math.max(num3, num4);
System.out.println("the maximum num is :" + maxnum);
System.out.println("the maximum num is :" + maxnum1);
System.out.println("the maximum num is :" + Math.min(num1, num2));
System.out.println("the maximum num is :" +Math.min(num3, num4));
	}

}
