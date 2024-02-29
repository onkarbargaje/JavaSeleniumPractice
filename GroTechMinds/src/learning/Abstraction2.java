package learning;
interface GF_Abstraction2
{
	void multi();
	void divide();
}

interface f_Abstraction2 extends GF_Abstraction2
{
	void add();
	void subtract();
	
}

public class Abstraction2  implements f_Abstraction2
{
	public static void main(String[] args)
	{
		
		Abstraction2 ab= new Abstraction2();
		ab.add();
		ab.divide();
		ab.subtract();
		ab.multi();
		
		
	}

	@Override
	public void multi() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtract()
	{
		// TODO Auto-generated method stub
		
	}

}
