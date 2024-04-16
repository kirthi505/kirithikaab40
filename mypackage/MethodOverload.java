package mypackage;

public class MethodOverload {
	
	
	void add(int a)
	{
	System.out.println(a );	
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	void add(int c,int d,int e)
	{
		
		System.out.println(c+d+e);
	}


	public static void main(String[] args) 
	
	{
		MethodOverload m1=new MethodOverload();
		m1.add(5);
		m1.add(1,2);
		m1.add(1,3,5);
	

	}

}
