package student;

public class MyStudent {

	public static void main(String[] args) {
		Student[] s=new Student[10];
		
		s[0]=new Student(1,"Max1",78);
		s[1]=new Student(2,"Max2",49);
		s[2]=new Student(3,"Max3",67);
		s[3]=new Student(4,"Max4",91);
		s[4]=new Student(5,"Max5",36);
		s[5]=new Student(6,"Max6",82);
		s[6]=new Student(7,"Max7",69);
		s[7]=new Student(8,"Max8",70);
		s[8]=new Student(9,"Max9",73);
		s[9]=new Student(10,"Max10",55);
		
		int max=Integer.MIN_VALUE;
		int maxIndex=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].marks>max)
			{
				max=s[i].marks;
				maxIndex=i;
			}
		}
		System.out.println(s[maxIndex]);

	}

}
