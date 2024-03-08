package learning;

public class MainMethodOverloading 
{
	public static void main() 
	{
		System.out.println("2");

	}
	public  void main(int a) 
	{
		System.out.println("3");

	}

	public static void main(String[] args) 
	{
		//System.out.println("1");
		//MainMethodOverloading.main();
		//MainMethodOverloading.main(null);
		MainMethodOverloading m1= new MainMethodOverloading();
		m1.main(1);
		main();
		
		

	}
	
	

}
