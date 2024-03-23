package collectionLearning;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo_3 
{
	public static void main(String[] args) 
	{
		String arr[]= {"Onkar", "Kirti","Bargaje"};		
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		al.add("Dhanake");
		System.out.println(al);
	}

}
