package department;

public class StaffMember {

	String memName,memQual;
	
	StaffMember(String a,String b)
	{
		memName=a;
		memQual=b;
	}
	void showStaff()
	{
		System.out.println("Member name:"+memName);
		System.out.println("Member Qualification:"+memQual);
	}
}
