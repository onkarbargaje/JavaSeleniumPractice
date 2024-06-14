package collectionLearning;

import java.util.PriorityQueue;

public class QueueDemo1 
{

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.offer("a");
		pq.offer("a");
		pq.offer("b");
		pq.offer("c");
		System.out.println(pq);
		
		System.out.println(pq.element());
		System.out.println(pq.peek());

	}

}
