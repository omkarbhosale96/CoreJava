package printTreeSet;
import java.util.*;
;public class MySet {

	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		s.add("Violet");
		s.add("Purple");
		s.add("Grey");
		s.add("Pink");
		s.add("Green");
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
