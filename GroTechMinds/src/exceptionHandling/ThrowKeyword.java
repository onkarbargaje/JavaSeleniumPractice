package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args)
	{
          try {
          throw new Exception("User is not found");
          }
          catch(Exception onkar)
          {
        	  onkar.printStackTrace();
          }

	}

}
