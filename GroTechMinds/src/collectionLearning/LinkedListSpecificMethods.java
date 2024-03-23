package collectionLearning;

import java.util.LinkedList;

public class LinkedListSpecificMethods {

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add(100);
		l1.add("Welcome");
		l1.add(78.89);
		l1.add(true);
		l1.add('c');
		l1.add("Welcome");
		l1.add("Welcome");
		l1.add(null);
		System.out.println(l1.size());
		System.out.println(l1);
		l1.addFirst("Onkar");
		System.out.println(l1);
		l1.addLast("Bargaje");
		System.out.println(l1);
		l1.getFirst();
		System.out.println(l1.getFirst());

	}

}
