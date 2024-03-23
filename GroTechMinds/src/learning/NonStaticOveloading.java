package learning;

public class NonStaticOveloading 
{
	public void add() 
	{
		System.out.println("1");
	}
	
	public void add(int x) 
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		NonStaticOveloading nso= new NonStaticOveloading();
		nso.add(0);

	}

}
