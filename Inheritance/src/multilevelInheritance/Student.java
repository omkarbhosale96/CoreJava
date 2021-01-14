package multilevelInheritance;

public class Student extends College {

	String stName;
	
	void displayStu(String stName)
	{
		this.stName=stName;
		System.out.println("Student name:"+stName);
		displayCl();
	}
}
