package mypackage;

public class NonAndStatic_4 {

	
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
		void get()
		{
			System.out.println("hi");
		}
		void set()
		{
			System.out.println("hello");
		}
		void alter()
		{
			System.out.println("welcome");
		}
		void update()
		{
			System.out.println("to");
		}
		void details()
		{
			System.out.println("grotectminds");
		}
		public static void main(String[]arg)
		{
		Add();

		Sub();

		Mul();

		Div();
	    
		Mod();
		NonAndStatic_4 n1=new NonAndStatic_4();
		n1.get();
		n1.set();
		n1.update();
		n1.alter();
		n1.details();


	}

}
