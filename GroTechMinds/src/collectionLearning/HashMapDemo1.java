package collectionLearning;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) 
	{
		HashMap hm= new HashMap();
		//HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(101, "VW");
		hm.put(102, "Nexon");
		hm.put(103, "Audi");
		hm.put(104, "Safari");
		hm.put(105, "Nexon");
		hm.put(106, "nexon");
		hm.put(106, "nexon");
		System.out.println(hm);
		System.out.println(hm.get(103));
		System.out.println(hm.remove(106));
		System.out.println(hm);
		System.out.println(hm.containsKey(102));
		System.out.println(hm.containsValue("BMW"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for(Object x:hm.keySet())
		{
			System.out.println(x + "  " +hm.get(x));
		}
		
		//entry methods
		
		for(Object r:hm.entrySet())
		{
			System.out.println(r);
		}
		Iter
	}

}
