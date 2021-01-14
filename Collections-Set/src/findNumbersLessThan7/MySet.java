package findNumbersLessThan7;
import java.util.*;
public class MySet {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		
		s.add(2);
		s.add(9);
		s.add(0);
		s.add(12);
		s.add(27);
		s.add(3);
		s.add(5);
		int a[]=new int[s.size()];
		Iterator<Integer> it=s.iterator();
		while(it.hasNext())
		{
			for(int i=0;i<a.length;i++)
			{
				a[i]=it.next();
			}
		}
		TreeSet<Integer> s1=new TreeSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<7)
			{
				s1.add(a[i]);
			}
		}
		System.out.println(s1);
	}

}
