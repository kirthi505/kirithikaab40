package mypackage;

public class Method1 {
	//no para no return
	void greeting()
	{
		System.out.println("hello");
	}
String greeting1()
{
	return "hello this is keerthi";
}
void greeting3(String name)
{
	System.out.println("hello is :"+ name);
}
String greeting4(String name)
{
	return( "hello this is keerthi :"+name);
}
	public static void main(String[] args)
	{
		
		Method1 m1=new Method1();
		m1.greeting();
		String str1=m1.greeting1();
		System.out.println(str1);
		m1.greeting3("john");
		System.out.println(m1.greeting4("keerthi"));
	}

}
