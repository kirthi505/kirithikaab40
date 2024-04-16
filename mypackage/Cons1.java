package mypackage;

public class Cons1 {
	int x;
	int y;
	String s;
	
	/*Cons1()//default cons
	{
		x=10;
		y=20;
		s="keerthi";
	}*/
	Cons1(int a,int b,String g)
	{
		 x=a;
		 y=b;
	 s=g;
	}
	void Display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}

	public static void main(String[] args) 
	{

//Cons1 c1=new Cons1();
		Cons1 c1=new Cons1(10,20,"ruby");
c1.Display();
	}

}
