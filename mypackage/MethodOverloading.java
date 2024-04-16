package mypackage;

public class MethodOverloading {
	 void add()
	{
		System.out.println("aaa");
	
	}
	void add(int a)
	{
		System.out.println("bbb");
	}


	public static void main(String[] args)
	{

		MethodOverloading	 a1=new MethodOverloading();
		a1.add();
	a1.add(7);
	
	}

}
