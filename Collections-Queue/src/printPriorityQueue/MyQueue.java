package printPriorityQueue;
import java.util.*;
public class MyQueue {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<>();
		
		p.add("Mad");
		p.add("Max");
		p.add("The");
		p.add("Fury");
		p.add("Roads");
		
		Iterator<String> it=p.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
