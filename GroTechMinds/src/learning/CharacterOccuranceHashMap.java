package learning;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccuranceHashMap {

	public static void main(String[] args) 
	{
		 String str = "onkar bargaje kirti";

	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to char array
	        char[] charArray = str.toCharArray();

	        // Iterate through each character in the array
	        for (char c : charArray) {
	        	// if the space is available then it will not go inside loop
	        	//if (!String.valueOf(c).isBlank()) // java version 11  {
	            // If the character is already present in the map, increment its count
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // If the character is not present, add it to the map with count 1
	                charCountMap.put(c, 1);
	            }
	        //	}
	        }
	        System.out.println(str + "  " + charCountMap);

	}

}
