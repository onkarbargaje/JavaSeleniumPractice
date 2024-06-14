package learning;
class UpperClass
{
	void add()
	{
		System.out.println("1");
	}
	
	
}

public class SuperKeyword extends UpperClass
{
	void add()
	{
		super.add();
		System.out.println("2");
		//super.add();
	}

	public static void main(String[] args) 
	{
		SuperKeyword sk= new SuperKeyword();
		sk.add();
		
		//super keyword is used to call the parent class implementation along with chils class in case o
		// method overriding. super keyword is used with only non static method
		
		

	}

}
