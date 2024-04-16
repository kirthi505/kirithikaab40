package assignment;

public class Ass4 {

	static void Add()
	{
	 int  a=10;
     int  b=20;
	 int c=a+b;
	System.out.println("result is :" + c);
	}
	
	static void Sub()
	{
	int a=40;
	int b=20;
	int c=a-b;
	System.out.println("result is :" + c);
	}
	
	
	static void Mul()
	{
	 int a=10;
	 int b=20;
	int c=a*b;
	System.out.println("result is :" + c);
	}
	
	
	static void Div()
	{
	int a=40;
	 int b=20;

     int c=a/b;
     System.out.println("result is :" + c);
	}
	
	static void Mod()
	{
	int a=40;
	 int b=3;

     float c=a%b;
     System.out.println("result is :" + c);
	}
	
	public static void main(String[]arg)
	{
	Add();

	Sub();

	Mul();

	Div();
    
	Mod();
	
	}

}
