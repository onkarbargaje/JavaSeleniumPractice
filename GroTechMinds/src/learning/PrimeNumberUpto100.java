package learning;

import java.util.Scanner;

public class PrimeNumberUpto100 
{
		
		public static void main(String[] args){
		System.out.println("Enter input number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for (int i=2; i<=n; i++)
			{
				int count=0;
				for (int j=1; j<=i; j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if (count==2)
				{
					System.out.print(i + " ");
				}
			}
		
			

		}
}


