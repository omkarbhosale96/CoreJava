package student;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<>();
		
		a.add(new Student("ABC",1,75));
		a.add(new Student("ABCDEF",2,40));
		a.add(new Student("BCD",3,66));
		a.add(new Student("DE",4,72));
		a.add(new Student("AB",5,89));
		a.add(new Student("EFG",6,42));
		a.add(new Student("BCDE",7,94));
		a.add(new Student("BC",8,52));
		a.add(new Student("ABCDEFGH",9,60));
		a.add(new Student("A",10,78));
		//sort by name
		Collections.sort(a,new Comp());
		//sort by marks
		Collections.sort(a,new Comp2());
		
		Iterator<Student> it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
