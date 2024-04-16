package mypackage;

public class Strnigin {

	public static void main(String[] args) 
	{
		String name="NetBeans";
	int	l=name.length();
	System.out.println(l);
	String str=name.trim();
	System.out.println(str);
	String str1=name.toUpperCase();
	System.out.println(str1);
	String str2=name.toLowerCase();
	System.out.println(str2);
	String str3=name.replace('e','r');
	System.out.println(str3);
	String str4=name.substring(3,5);
	System.out.println(str4);
	char str5=name.charAt(3);
	System.out.println(str5);
	boolean str6=name.equals("NetBeans");
	System.out.println(str6);
	}

}
