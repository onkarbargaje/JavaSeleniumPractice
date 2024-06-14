package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) 
	{
         try {
         int a= 9/0;
         }
         catch(Exception onkar)
         {
        	 System.out.println("We got an Exception");
        	 onkar.printStackTrace();
         }
         

	}

}
