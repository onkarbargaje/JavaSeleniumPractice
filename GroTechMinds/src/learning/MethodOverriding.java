package learning;
class GrandParent
{
	void add()
	{
		System.out.println("method from grandparent class");
	}
}
class Parent extends GrandParent
{
	  void add()
	{
		System.out.println("method from parent class");
		super.add();
	}
	  
	  public  static void subtract()
		{
			System.out.println("3");
		}

}


public class MethodOverriding extends Parent
{
	void add()
	{
		System.out.println("method from child class");
	}
	
	public  static void subtract()
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		//Parent p1= new Parent();
		//p1.add();
		//MethodOverriding m1= new MethodOverriding();
		//m1.add();
		//super.add();
		subtract();
		MethodOverriding m1 =new Parent();
      

	}

}
