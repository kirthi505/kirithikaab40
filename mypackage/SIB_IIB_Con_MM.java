package mypackage;

public class SIB_IIB_Con_MM {
	
	
	static
	{
		System.out.println("i am static");
	}
	{
		System.out.println("i am iib");
	}
	SIB_IIB_Con_MM()
	{
		System.out.println("i am cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main maethod");
		SIB_IIB_Con_MM s1=new SIB_IIB_Con_MM();
		

	}

}
