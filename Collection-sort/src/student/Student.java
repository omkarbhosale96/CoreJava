package student;

public class Student {

	String name;
	int rollNo;
	int marks;
	Student(String name,int rollNo,int marks)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	

}
