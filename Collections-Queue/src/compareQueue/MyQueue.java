package compareQueue;

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
		p.add(100);
		
		PriorityQueue<Integer> p1=new PriorityQueue<>();
		p1.add(10);	
		p1.add(90);
		p1.add(50);
		p1.add(20);
		p1.add(40);
		p1.add(30);
		p1.add(70);
		p1.add(80);
		p1.add(60);
		
		
		if(p.size()==p1.size() && p.containsAll(p1) && p1.containsAll(p))
		{
			System.out.println("Equals");
		}
		else 
		{
			System.out.println("Not equals");
		}

	}

}
