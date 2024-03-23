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
}


public class MethodOverriding extends Parent
{
	void add()
	{
		System.out.println("method from child class");
	}

	public static void main(String[] args) 
	{
		//Parent p1= new Parent();
		//p1.add();
		MethodOverriding m1= new MethodOverriding();
		m1.add();
		//super.add();
		
      

	}

}
