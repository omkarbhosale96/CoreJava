package displayPositions;

import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i)+" is at index "+i);
		}

	}

}
