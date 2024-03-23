package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfNumbersInArray {

	public static void main(String[] args) 
	{
		int a[]= new int[4];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		
		
		int sum= 0;
		//List<Integer> arrayList = new ArrayList<>(Arrays.asList(a));
		for(int i=0; i<a.length; i++)
		{
		
			 sum=sum+a[i];
		}
		System.out.println(sum);
		//method 2
		for (int x: a)
		{
			sum=sum+x;
		}
		
	
	System.out.println(sum);
		


	}

}
