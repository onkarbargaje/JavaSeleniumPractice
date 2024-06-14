package learning;

import java.util.Scanner;

public class LargestAmong3Numbers {

	public static void main(String[] args) 
	{
           Scanner sc= new Scanner(System.in);
           System.out.println("Please enter number");
           int a=sc.nextInt();
           
           System.out.println("Please enter second number");
           int b=sc.nextInt();
           
           System.out.println("Please enter third number");
           int c=sc.nextInt();
           
           if(a>b && a>c)
           {
        	   System.out.println(a + " is larget among other numbers");
           }
           else if(b>a && b>c)
           {
        	   System.out.println(b + " is larget among other numbers");
           }
           else
           {
        	   System.out.println(c + " is larget among other numbers");
           }

	}

}
