package learning;

public class FindEvenOddFromArray {

	public static void main(String[] args) 
	{
		int a[]= new int[4];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 45;
		
		int even[]= {};
		int odd[]= {};
		for(int i=0; i<a.length; i++)
		{
			if (a[i]%2==0)
			{
				 System.out.println("Even Number are " + a [i]);
				
			}
			else 
			{
				System.out.println("Odd Number are " + a [i]);
			}
		}



	}

}
