package collectionLearning;

import java.util.LinkedList;

public class LinkedListDemo_1 {

	public static void main(String[] args) 
	{

         //declare linkedlist
		LinkedList l1 = new LinkedList();
		//LinkedList <Integer> l2 = new LinkedList<Integer>();
		//LinkedList <String> l3 = new LinkedList<String>();
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
	}

}
