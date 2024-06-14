package learning;

import java.util.HashMap;
import java.util.Map;

public class DigitOccuranceInNumberHashMap {

	public static void main(String[] args)
	{
		long number= 1234533492 ;
		Map<Long, Integer> digitCount= new HashMap<>();
		
		while(number!=0)
		{
			long digit=number%10;
			if(digitCount.containsKey(digit))
			{
				digitCount.put(digit, digitCount.get(digit)+1);
			}
			else
			{
				digitCount.put(digit, 1);
			}
			number=number/10;
			
		}
		System.out.println(digitCount);
		



	}

}
