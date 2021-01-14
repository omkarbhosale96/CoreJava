package department;

public class Department {
	
	String depName,hodName;
	
	Department(String a,String b)
	{
		depName=a;
		hodName=b;
	}
	void showDeptDetails()
	{
		System.out.println("Department:"+depName);
		System.out.println("HOD name:"+hodName);
	}

}
