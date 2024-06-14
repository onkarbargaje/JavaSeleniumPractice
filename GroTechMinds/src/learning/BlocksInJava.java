package learning;

public class BlocksInJava 
{
	static
	{
		System.out.println("This is static initialisation block");
	}
	static
	{
		System.out.println("This is static initialisation block2");
	}
	
	
	{
		System.out.println("This is instance initialisation block");
	}
	public static void add()
	{
		System.out.println("This static method");
	}
	public void BlocksInJava(int x)
	{
		System.out.println("This is constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("I am from main method");
		BlocksInJava b1= new BlocksInJava();
		
		add();
	}

}
