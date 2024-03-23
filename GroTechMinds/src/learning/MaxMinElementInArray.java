package learning;

import java.util.Arrays;

public class MaxMinElementInArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,20,33,78,100,11,101};
	    
		int max=a[0];
		for (int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				//System.out.println(max);
			}
			//System.out.println(max);
		}
		System.out.println("Maximum number in array is " +max);
		
		int min=a[0];
		for (int i=1; i<a.length; i++)
		{
			if(a[i]<max)
			{
				max=a[i];
				//System.out.println(max);
			}
			//System.out.println(max);
		}
		System.out.println("Minimum number in array is "+ min);
	}

}
