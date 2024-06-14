package collectionLearning;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo1 {

	public static void main(String[] args) 
	{
		Hashtable<String, Integer> hm= new Hashtable<String, Integer>();
		hm.put( "VW", 101);
		hm.put("Nexon", 102);
		hm.put("Audi", 103);
		hm.put("Safari",104);
		//hm.put(null, 105);
		
		System.out.println(hm.get(hm));

	}

}
