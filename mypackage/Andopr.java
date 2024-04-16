package mypackage;

public class Andopr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		int salary=20000;
		
		if(age<=18 && salary>10000)
		{
			System.out.println("true");
			
			if(age>18 || salary>10000)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("false");
		}

	}

}
