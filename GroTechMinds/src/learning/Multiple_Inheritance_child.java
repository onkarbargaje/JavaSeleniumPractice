package learning;

interface Multiple_Inheritance_Parent2
{
	void add();
}

interface Multiple_Inheritance_Parent1 
{
	void subtract();
	void add();
}

public class Multiple_Inheritance_child implements Multiple_Inheritance_Parent1, Multiple_Inheritance_Parent2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
