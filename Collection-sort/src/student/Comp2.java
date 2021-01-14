package student;

import java.util.Comparator;

public class Comp2 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks==o2.marks)
			return 0;
		else if(o1.marks<o2.marks)
			return -1;
		else
			return 1;
	}

}
