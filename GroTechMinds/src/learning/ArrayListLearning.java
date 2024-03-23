package learning;

import java.util.ArrayList;

public class ArrayListLearning 
{

	public static void main(String[] args) 
	{
		ArrayList list= new ArrayList();
		list.add("Arun");
		list.add("Varun");
		list.add("Tarun");
		list.add("Arun");
		list.add(null);
		list.add(90102902);
		list.add(27810.189);
		list.add("Arun");
		//System.out.println(list);
		
		list.get(2);
		System.out.println(list.get(2));
		
		list.size();
		
		System.out.println(list.size());
		
		for (Object x:list)
		{
			System.out.println(x);
		}
		
		list.remove(2);
		System.out.println(list.remove(2));
		
		System.out.println(list);
		
	
	}

}
