package averageOfMarks;

import java.util.Scanner;

public class AverageOfMarks {
	
	int a,b,c,d,e,f;
	int sum,avg;
	void getMarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		sc.close();
		
	}
	void getAverage()
	{
		sum=a+b+c+d+e+f;
		avg=sum/6;
		System.out.println("Sum:"+sum+" Average:"+avg);
	}
	void getGrade()
	{
		if(avg>=90)
			System.out.println("Grade:A");
		else if(avg>=80)
			System.out.println("Grade:B");
		else if(avg>=70)
			System.out.println("Grade:C");
		else if(avg>=60)
			System.out.println("Grade:D");
		else if(avg>=40)
			System.out.println("Grade:E");
		else
			System.out.println("Grade:F");
	}

}
