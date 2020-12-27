import java.util.Scanner;

public class GrossSalary {
	int basicSal;
	float grossSal;
	void getSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		basicSal=sc.nextInt();
		sc.close();
		
	}
	void calculateSalary()
	{
		float hra,da;
		if(basicSal<=10000)
		{
			hra=20/100f;
			da=80/100f;
			grossSal=hra*basicSal+da*basicSal+basicSal;
			System.out.println("The gross salary is:"+grossSal);
			
		}
		else if(basicSal<=20000)
		{
			hra=25/100f;
			da=90/100f;
			grossSal=hra*basicSal+da*basicSal+basicSal;
			System.out.println("The gross salary is:"+grossSal);
		}
		else
		{
			hra=30/100f;
			da=95/100f;
			grossSal=hra*basicSal+da*basicSal+basicSal;
			System.out.println("The gross salary is:"+grossSal);
		}
	}

}
