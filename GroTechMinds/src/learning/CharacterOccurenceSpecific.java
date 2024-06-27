package learning;

public class CharacterOccurenceSpecific {

	public static void main(String[] args)

	{
       String s= "Onkar Shashikant Bargaje";
       int totalCount= s.length();
       
       int totalCountAfterRemove=s.replace("e", "").length();
       
       int count=totalCount-totalCountAfterRemove;
       
       System.out.println("Count of particular word is "+ count);


	}

}
