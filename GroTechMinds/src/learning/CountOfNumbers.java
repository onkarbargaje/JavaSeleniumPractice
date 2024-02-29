package learning;

import java.util.Scanner;

public class CountOfNumbers
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		
		StringBuffer sb= new StringBuffer();
		//int in=sb.length(sb);
		System.out.println(sb.length());
		
		String  s1= "Java,Selenium";
		
		String s2[]= s1.split(",");
		System.out.println(s2);
		

	}

}
