package mypackage;

public class Global_var {
	int a=10;// global variable
	 final int b=5;
	
	void add()
	{
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
	}
	void mul()
	{
		
		System.out.println(a*b);
	}

	public static void main(String[] args)
	{
		 Global_var g1=new Global_var();
		 g1.add();
		 g1.sub();
		 g1.mul();

	}

}
