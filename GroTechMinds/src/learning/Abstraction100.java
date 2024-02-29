package learning;
interface GF_Abstraction  // in interface 100% abstract method should be present
{
	void car();          // all the methods of interface by default public methods check main method for this
	void bus();
}

abstract class F_Abstraction implements GF_Abstraction // Abstract class have concrete and abstract method
{
	abstract void add ();
	abstract void subtract();
	
}

public class Abstraction100 extends F_Abstraction
{

	public static void main(String[] args) 
	{
		Abstraction100 ab= new Abstraction100();
		ab.add();
		ab.bus();
		ab.car();
		ab.subtract();

	}

	@Override
	public void car() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void subtract() {
		// TODO Auto-generated method stub
		
	}

}
