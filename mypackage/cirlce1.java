package mypackage;

public class cirlce1 
{
      public double radius=7;
      
      public double area()
      {
    	  return Math.PI * radius * radius;
      }
      public double perimeter()
      {
    	  return 2*Math.PI*radius;
      }
      public double circumference()
      {
    	  return perimeter();
      }
      public class cylinder extends cirlce1
      {
    	  public double height=10;
		public int radius;
    	   public double volume()
    	   {
    		   return area()*height;
    	   }
      }
	public static void main(String[] args)
	{
		cirlce1 c2=new cirlce1();
	cylinder c1=c2.new cylinder();
	//c1.radius=7;
	//c1.height=10;
	System.out.println("the volume is :" + c1.volume());
	System.out.println("the area is :" + c1.area());
	System.out.println("the volume is :" + c2.area());
	System.out.println("the volume is :" + c2.circumference());
	}

}
