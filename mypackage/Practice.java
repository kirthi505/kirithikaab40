package mypackage;

public class Practice {
	
	
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("The sum is :" + sum);
	}
	void sub()
	{
		int a=20;
		int b=10;
		int sum=a-b;
		System.out.println("The sum is :" + sum);
	}
	Practice()
	{
		System.out.println("hi");
	}

	public static void main(String[] args)
	
	{
	
       add();
       Practice p1=new Practice();
       p1.sub();
       
		
	}

}
