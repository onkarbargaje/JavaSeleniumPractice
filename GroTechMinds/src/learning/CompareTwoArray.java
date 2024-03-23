package learning;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args)
	{
		int a[]= {10,20,33,78,100};
		int b[]= {10,20,33,8,10};
		Arrays.equals(a, b);
		
	
		System.out.println(Arrays.equals(a, b));
		//method 2
		//boolean status = false;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==b[i])
			 {
				 System.out.println("Element at index " + a[i] + " is equal with another array");				 
			 }
			 else 
			 {
				 System.out.println("Element at index " + a[i] + " is not equal with another array");
			 }
		 }
		 /*if (status==true)
		 {
			 System.out.println("Arrays are not equal");
		 }
		 else
		 {
			 System.out.println("Arrays are  equal");
		 }
		 */
	}
	

}
