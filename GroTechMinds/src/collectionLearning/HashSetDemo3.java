package collectionLearning;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args)
	{
		//union intersection
		
		HashSet<Integer>hs= new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
        
		HashSet<Integer>h= new HashSet<Integer>();
		h.add(6);
		h.add(7);
		h.add(2);
		
		//union
		System.out.println(h.addAll(hs));
		System.out.println(h);
		
		//intersection
		
		h.retainAll(hs);
		System.out.println(hs);
		
		//difference
		hs.removeAll(h);
		System.out.println(hs);
		
		
	}

}
