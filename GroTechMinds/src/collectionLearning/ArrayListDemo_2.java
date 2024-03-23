package collectionLearning;

import java.util.ArrayList;
import java.util.Collections;

import learning.MainMethodOverloading;

public class ArrayListDemo_2 
{
	public static void main(String[] args)
	{
		ArrayList ak=new ArrayList();
	    ak.add("X");
	    ak.add("X");
	    ak.add("Y");
	    ak.add("Z");
	    ak.add("Q");
	    ak.add("P");
	    ak.add("R");
		
	    ArrayList ak_duplicate=new ArrayList();
	    ak_duplicate.addAll(ak);
	    System.out.println(ak_duplicate);
	    
	    ak_duplicate.removeAll(ak);
	    System.out.println(ak_duplicate);
	    //sorting element
	   Collections.sort(ak);
	   
	   System.out.println("Elements after sorting " +ak);
	   Collections.reverseOrder();
	   System.out.println("Elements after sorting reversed order " +ak);
	   
	   //to shuffle element
	   Collections.shuffle(ak);
	   System.out.println("Elements after shuffle " +ak);
	}
	

}
