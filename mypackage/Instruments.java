package mypackage;


public class Instruments
       {

		  void sound() 
		  {
		    System.out.println("make a sound");
		  }
		  void music()
		  {
			  System.out.println("wish to listen always");
		  }
		}

		class Guitar extends Instruments {

		  @Override
		  void sound()
		  {
		    System.out.println("we have all kinds of instrments");
		  }

		  public static void main(String[] args) 
		  {
		    Instruments i1=new Guitar();
		    
		    i1.sound(); 
		    i1.music();
		  }
		}