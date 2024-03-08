package encapsulation;

class Kirti
{
	
	private int age=30;
	public void set_age(int age)
	{
		this.age=age;
	}
	
	public int get_age()
	{
		return age;
	}
	
	private String password="Abcd@1234";
	
	public void set_password(String password)
	{
		this.password=password;
	}
	
	public String get_password()
	{
		return password;
	}
			
	
}
public class Onkar 
{

	public static void main(String[] args) 
	{
		Kirti k1= new Kirti();
		k1.set_password("Abcd@1234");
		System.out.println(k1.get_password());
		k1.set_age(27);
		System.out.println(k1.get_age());
	}

}
