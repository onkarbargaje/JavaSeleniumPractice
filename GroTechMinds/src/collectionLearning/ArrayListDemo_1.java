package collectionLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo_1 {

	public static void main(String[] args)
	{

             //to declare Array
		ArrayList al= new ArrayList();
		//List l= new ArrayList();
		// to store homogeneous data in Arraylist
		//ArrayList<String> as= new ArrayList<String>();
		//ArrayList<Integer> ai= new ArrayList<Integer>();
		al.add(100);
		al.add("Welcome");
		al.add(78.89);
		al.add(true);
		al.add('c');
		al.add("Welcome");
		al.add("Welcome");
		System.out.println(al.size());
		
		al.remove(5);
		
		System.out.println(al.size());
		// to insert new element
		al.add(5, "Kirti");
         System.out.println(al);
         al.add(1, "Kirti");
         System.out.println(al);
         al.set(2,"Bargaje");
         System.out.println(al);
         
         //to read the data from arraylist
         //for loop //for each loop // Iterator
         
         for (int i=0; i<al.size();i++)
         {
        	// Object obj=al.get(i);
        	 System.out.println(al.get(i));
         }
         
         //using for each
         for (Object x:al)
         {
        	 System.out.println(x);
         }
         
         //using iterator
         Iterator ar= al.iterator();
         while(ar.hasNext())
         {
        	 
        	 System.out.println(ar.next());
         }
	}

}
