package learning;

public class StaticNonStatic 
{
	public static void add()
	{
		System.out.println("1");
	}
	
	void sub()
	{
		System.out.println("2");
	}
	
	

	public static void main(String[] args) 
	{
		//StaticNonStatic.add(); // directly accessed by ClassName.MethodName
		StaticNonStatic sc= new StaticNonStatic();
		
	}

}
