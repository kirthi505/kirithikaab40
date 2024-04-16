package mypackage;

public class GlobalVar {
	int a=10;
	void add()
	{
	if(a>2)	
	{
		System.out.println("the value is :" + a);
	}
	}

	public static void main(String[] args) 
	{
		GlobalVar g1=new GlobalVar();
	g1.add();
	}

}
