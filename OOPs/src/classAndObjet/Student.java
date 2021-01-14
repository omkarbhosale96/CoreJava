package classAndObjet;

public class Student {
	
	int rollNo;
	String name;
	int marks;
	
	void getData()
	{
		rollNo=1;
		name="Omkar";
		marks=67;
	}
	void print()
	{
		System.out.println("Roll no:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}

}
