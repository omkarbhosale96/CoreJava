package convertToArray;

import java.util.PriorityQueue;

public class MyQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> p=new PriorityQueue<>();
		p.add(10);
		p.add(50);
		p.add(90);
		p.add(20);
		p.add(40);
		p.add(30);
		p.add(70);
		p.add(80);
		p.add(60);
		
		Object[] a=p.toArray();
		
		for(Object b:a)
			System.out.print(b+" ");

	}

}
