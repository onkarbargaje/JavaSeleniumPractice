package typeCasting;
class Coldrinks
{
	static void cola()
	{
		System.out.println("1");
	}
	void kokam()
	{
		System.out.println("2");	
	}
}
class Milk extends Coldrinks
{
	static void ButterMilk()
	{
		System.out.println("3");
	}
	void ChocolateMilk()
	{
		System.out.println("4");
	}
	
}
public class Tea extends Milk
{
	static void BlackTea()
	{
		System.out.println("5");
	}
	void LemonTea()
	{
		System.out.println("6");
	}

	public static void main(String[] args) 
	{
		
         Coldrinks c1 = new Milk(); //upcasting Milk to coldrinks we can access only coldrinks method
         c1.kokam();
         c1.cola();
        
         
          Milk m1 =(Milk) c1 ; //downcasting coldrinks object to Milk class object
        m1.ChocolateMilk();
        m1.kokam();
        m1.ButterMilk();
        m1.cola();
        //Downcasting Coldrink class object to Milk class object we can access the static and non static 
        // methods of coldrinks and Milk class only
	}

}
