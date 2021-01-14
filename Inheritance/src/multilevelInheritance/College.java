package multilevelInheritance;

public class College extends University {

	String clName="COE Pune";
	
	void displayCl()
	{
		displayUni();
		System.out.println("College name:"+clName);
	}
}
