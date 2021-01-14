package getNumbersGreaterThan;

import java.util.*;

public class MySet {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		s.add(12);
		s.add(4);
		s.add(26);
		s.add(10);
		s.add(3);
		s.add(7);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		int a=sc.nextInt();
		
		int b[]=new int[s.size()];
		Iterator<Integer> it=s.iterator();
		while(it.hasNext())
		{
			for(int i=0;i<b.length;i++)
			{
				b[i]=it.next();
			}
		}
		TreeSet<Integer> s1=new TreeSet<>();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>=a)
			{
				s1.add(b[i]);
			}
		}
		System.out.println(s1);
		
	}

}
