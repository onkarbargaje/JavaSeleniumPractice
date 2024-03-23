package collectionLearning;

import java.util.HashSet;

public class HashSetLearning 
{

	public static void main(String[] args) 
	{
		HashSet hs= new HashSet(); //default capacity 16 with loadfactor 0.75
		//HashSet hss= new HashSet(100,(float)0.95); //size 100 with loadfactor 0.95
         //HashSet<Integer> hd= new HashSet<Integer>();
         
		//add objects/elements
		hs.add(100);
		hs.add("Heloo");
		hs.add(16.4);
		hs.add(true);
		hs.add(null);
		hs.add(100);
		System.out.println(hs);  //duplicates not allowed , insertion order not maintained
		
		hs.remove(100);
		System.out.println(hs);
		
		System.out.println(hs.contains(100));
		
		
	}

}
