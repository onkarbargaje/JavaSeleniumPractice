package learning;

public class StaticVaribaleValueChange {
	
	static int staticVariable=100;
	
	public void display()
	{
		System.out.println("Static varibale is "+ staticVariable);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVaribaleValueChange svc= new StaticVaribaleValueChange();
		svc.display();
		svc.staticVariable=200;
		svc.display();
	}

}
