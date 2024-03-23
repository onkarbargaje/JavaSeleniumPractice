package learning;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		int a[][]=new int [3][2];
		int b[][]= {{10,20},{30,40},{50,60}};
		
		System.out.println("Number of row in array " +b.length);
		System.out.println("Number of column in array " +b[0].length);

        // for(int r=0; r<=2;r++) 
        // {
        //	 for(int c=0;c<=1; c++)
        //	 {
        //		 System.out.print(b[r] [c]+ " ");
        //		 
        //	 }
        //	 System.out.println();
        // }
         
       //  for(int r=0; r<=b.length-1;r++) 
       //  {
       // 	 for(int c=0;c<=b[r].length-1; c++)
       // 	 {
        //		 System.out.print(b[r] [c]+ " ");
        		 
        //	 }
       // 	 System.out.println();
        // }
		
		//enhanced for loop
		for(int arr[]:b)
		{
			for(int x: arr)
			{
				System.out.println(x);
			}
		}

	}

}
