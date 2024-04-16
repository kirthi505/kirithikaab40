package mypackage;
 
class GrandParents 
{
   public GrandParents()
{
	System.out.println("i amm a grandparent");
}
class Parents extends GrandParents 
{
public Parents()

{
	 System.out.println("i am a parent class");
	
}
class child extends Parents
{
	public child ()
	{
		System.out.println("i am a child class");
	}

}


	public static void main(String[] args)
	{
		child c1=c1.new child();
		Parents c2=new Parents();
		GrandParents c3=c1.new GrandParents();
		

	}

}
}