package mypackage;

public class HowToAccessStatic_method {
	static void add()
	{
		System.out.println("ADDITION");
	}
	static void sub()
	{
		System.out.println("subtraction");
	}
	static void mul()
	{
		System.out.println("multiplication");
	}
	static void div()
	{
		System.out.println("division");
	}
	
	public static void main(String[]args)
	{
		add();
		sub();
		mul();
		div();
		System.out.println("MainMethod method");
	}

}

