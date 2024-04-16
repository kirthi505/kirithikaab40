package mypackage;
//method overriding achieved by inheritance
 class SuperClassTv
{
   public void Switchon()
    {
    	System.out.println("i am normal tv");
    }
   public void switchchannel()
   {
	   System.out.println("i am a channel");
   }
  class SubClassSmart extends SuperClassTv
   
  {   
	    @Override
  
	   public void Switchon()
	    {
	    	System.out.println("i am normal tv");
	    }
	    @Override
	   public void switchchannel()
	   {
		   System.out.println("i am a channel");
	   }
   }
  class override
  {
	public static void main(String[] args) 
	{
		SubClassSmart s1=new SubClassSmart();

		
		s1.Switchon();
		s1.switchchannel();

	}

}
}
