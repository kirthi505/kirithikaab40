package mypackage;
//paramterised constructor
public class Rectangle 
{

	
	Rectangle()
	{
	System.out.println("non para cons");	
	}
	Rectangle(int x,int y)
	{
		System.out.println("para cons");
	}

	public class cuboid extends Rectangle
	{
		cuboid ()
		{
			System.out.println("no para cons");
		}
		cuboid(int x,int y,int z)
		{
			super(3,6);
			System.out.println("para cons");
		}
	}

	
	public static void main(String[] args) 
	{
		Rectangle c=new Rectangle();
		cuboid c1=c.new cuboid(2,3,6);
		
		
	}

}

