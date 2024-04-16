package mypackage;

public class Circle {
	
       double radius;
       
       public Circle()
       {
    	    radius=2;
       }
       public double area()
       {
    	   return radius;
       }
       public double perimeter()
       {
    	   return radius;
       }
       public class cylinder extends Circle
       {
    	   double height;
    		   
    	  public cylinder()
    	   {
    		 height=5;  
    	   }
    	  public void volume()
    	  {
    		  
    	  }
    	
       }
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		cylinder c2=c1.new cylinder();
		c1.area();
		c1.perimeter();
		c2.volume();
	}

}
