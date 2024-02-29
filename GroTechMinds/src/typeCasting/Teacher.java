package typeCasting; 
// Upcasting type I

class Student
{
	void add()
	{
		System.out.println("1");
	}
	
	static void sub()
	{
		System.out.println("2");
	}
}

public class Teacher extends Student
{
	static void multi()
	{
		System.out.println("3");
	}

	void diff()
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{

            Student s1=  new Teacher(); //implicit upcasting we can access the only parent class methods
            //Student s1= (Student) new Teacher();// explicit upcasting
            s1.add();
            s1.sub();
       // by upcasting we are limiting to use properties of parent class only
	}

}
