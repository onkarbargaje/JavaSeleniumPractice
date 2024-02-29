package learning;

import java.util.Scanner;

public class Practice_Git 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=sc.nextInt();
		int count=0;
		
		for (int i=1; i<=n; i++)
		{
			
			if (n%i==0 )
			{
				count++;
			}
			
			
			
		}
		if(count==2)
		{
			System.out.println("Given number is prime");
			//break;
		}
		else
		{
			System.out.println("Number is not prime");
			//break;
		}
	}

}
