package learning;
class SuperCalling0
{
	SuperCalling0(int a)
    {
	   System.out.println("0");
	   
    }
	
}
 class  SuperCalling1 extends SuperCalling0
 {
	 
     SuperCalling1()
    {
    	 super(1);
	   System.out.println("1");
	   //super(1);
	   
    }
}
 
 class SuperCalling2 extends SuperCalling1
 {
	 
     SuperCalling2()
    {
    	 System.out.println("2");
    }
}
 class SuperCalling3 extends SuperCalling2
 {
	 
     SuperCalling3()
    {
    	 super();           // it is implicitly present even if we do not mentioned 
    	 System.out.println("3");
    }
}

public class SuperCalling extends SuperCalling3
{
	SuperCalling()
	{
		System.out.println("4");
	}
	
	public static void main(String[] args) 
	{
		//SuperCalling sc= new SuperCalling();
		new SuperCalling();
		//new SuperCalling3();  // to call 3 constructor we have created the object one only
		
		

	}

}
