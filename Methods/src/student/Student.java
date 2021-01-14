package student;

public class Student {
	int rn,cn,marks;
	String name;
	void inputData(int rn,String name,int cn,int marks)
	{
		this.rn=rn;
		this.name=name;
		this.cn=cn;
		this.marks=marks;
				
	}
	void display()
	{
		System.out.println("Roll no:"+rn);
		System.out.println("Name:"+name);
		System.out.println("Contact no:"+cn);
		System.out.println("Marks:"+marks);
	}

}
