package student;

import java.util.Comparator;

public class Comp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.compareTo(o2.name)==0)
			return 0;
		else if(o1.name.compareTo(o2.name)<0)
			return -1;
		else
			return 1;	
	}

	
}
