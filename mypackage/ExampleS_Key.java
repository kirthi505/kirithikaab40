package mypackage;

public class ExampleS_Key {
	
	private static final String x = null;
	String colour="white";
	void eat()
	{
		System.out.println("hi all");
	}
	class Animal extends ExampleS_Key
	{
		String colour="black";
		void DisplayColour()
		{
			System.out.println("display the colour :"+ super.colour);
		}
		void eat ()
		{
			System.out.println("welcome");
			super.eat();
		}
	}

	public static void main(String[] args) 
	
	{

Animal a1 =new Animal();
a1.DisplayColour();

a1.eat();


	}

}
