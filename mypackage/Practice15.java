package mypackage;
//method overloading
public class Practice15 {
	
	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	static double max(double a,double b)
	{
		return a>b?a:b;
	}
	static char max(char a,char b)
	{
		return a>b?a:b;
	}

	public static void main(String[] args) 
	{
		System.out.println(max(5,7));
		System.out.println(max(3.3,5.5));
		System.out.println(max('c','f'));
	}

}
