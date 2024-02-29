package typeCasting;
//Upcasting Type II
class Cobbis
{
	void Operation()
	{
		System.out.println("3");
	}
	static void Pegasus()
	{
		System.out.println("4");
	}
}

class FigMD extends Cobbis
{
	void DeliveryQA()
	{
		System.out.println("1");
	}
	
	static void ProductQA()
	{
		System.out.println("2");
	}
}

public class MRO extends FigMD
{
	void IT()
	{
		System.out.println("5");
	}
	static void Security()
	{
		System.out.println("6");
	}

	public static void main(String[] args) 
	{
		   FigMD f1 = new MRO();  // by upcasting MRO to FigMD we can access methods of FigMD as well as Cobbisonly
		   f1.DeliveryQA();
		   f1.Operation();
		   f1.Pegasus();
		   f1.ProductQA();
		   
		   MRO m1  =(MRO) f1; // downcasting superclass type to subclass object.
		   m1.DeliveryQA();
		   m1.IT();
		   m1.Operation();
		   m1.ProductQA();  
		   m1.Security();
		   // by downcasting FigmD to MRO we can access the all the methods of FigmD and MRO also
		   //non static methods of Cobbis also

	}

}
