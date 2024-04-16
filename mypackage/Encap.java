package mypackage;

public class Encap {
	
	private int acc_no;
	private String name;
	double acc_balance;
	
	
	

	public int getAcc_no() {
		return acc_no;
	}




	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getAcc_balance() {
		return acc_balance;
	}




	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}




	public static void main(String[] args)
	{

		Encap e1=new Encap();
		e1.setAcc_no(11);
		e1.setName("keerthi");
		e1.setAcc_balance(10000000.00);
		System.out.println(e1.getAcc_no());
		System.out.println(e1.getName());
		System.out.println(e1.getAcc_balance());

	}

}
