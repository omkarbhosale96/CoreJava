package diwaliBonus;

import java.util.Scanner;

public class DiwaliBonus {
	
	int salary,years,totalSal;
	
	void getSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		salary=sc.nextInt();
		System.out.println("Enter years");
		years=sc.nextInt();
		if(years<5)
		{
			totalSal=salary+15*salary/100;
		}
		else
		{
			totalSal=salary+35*salary/100;
		}
		System.out.println("Total salary is:"+totalSal);
		sc.close();
				
	}

}
