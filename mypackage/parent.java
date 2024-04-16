package mypackage;

public class parent{
	
	static void add()
	{
		System.out.println("hi");
	}
  public class childclass extends parent
  {
	static  void mul()
	  {
		  System.out.println("heloo");
  }
  
	public static void main(String[] args) 
	{
	
		mul();
		add();
	

	}

}
}