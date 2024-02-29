package typeCasting;
//please refer diagram in note book for this
class Motorola 
{
	static void GSeries()
	{
		System.out.println("1");
	}
	void MSeries()
	{
		System.out.println("2");
	}
}

class Samsung extends Motorola
{
	static void Galaxy()
	{
		System.out.println("3");
	}
	void Pro()
	{
		System.out.println("4");
	}
}

public class Mobile extends Samsung
{
	static void TouchPhone()
	{
		System.out.println("5");
	}
	void SmartPhone()
	{
		System.out.println("6");
	}

	public static void main(String[] args) 
	{
		  Motorola m1 =new Mobile();
		  m1.MSeries();
		  m1.GSeries();
		  
		 Samsung s1 =new Mobile();
         Mobile m2 =(Mobile)s1; 
         m2.MSeries();
         m2.Pro();
         m2.SmartPhone();
         m2.Galaxy();
         m2.GSeries();
         m2.TouchPhone();
	}

}
