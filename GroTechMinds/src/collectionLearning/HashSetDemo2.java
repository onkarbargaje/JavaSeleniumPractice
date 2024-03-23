package collectionLearning;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(100);
		hs.add(12);
		hs.add(16);
		hs.add(987);
		hs.add(null);
		hs.add(100);
		System.out.println(hs); 
		HashSet<Integer> h= new HashSet<Integer>();
		
		h.addAll(hs);
		h.add(34);
		System.out.println(h);
		
	
	}

}
