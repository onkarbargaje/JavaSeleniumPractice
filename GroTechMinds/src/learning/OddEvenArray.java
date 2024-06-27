package learning;

import java.util.ArrayList;
import java.util.List;

public class OddEvenArray {

	public static void main(String[] args) 
	{
		int [] a= {1,4,9,2,6,3};
		
		List<Integer> evenArray= new ArrayList<Integer>();
		List<Integer> oddArray= new ArrayList<Integer>();
		
		for (int e:a)
		{
			if(e%2==0)
			{
				evenArray.add(e);
			}
			else
			{
				oddArray.add(e);
			}
		}
		System.out.println(evenArray);
		System.out.println(oddArray);
	}

}
