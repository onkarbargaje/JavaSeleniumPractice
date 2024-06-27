package learning;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice_Git 
{
	public static void main(String[] args) 
	{
		int a[]= {1,24,56,78,37};

		int max= a[0];

		for (int i=1; i<a.length; i++)
		{

		   if(a[i] > max)
		{
		  max= a[i];

		}


		}
		
		System.out.println(max);

}
}
