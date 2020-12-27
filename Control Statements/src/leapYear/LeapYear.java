package leapYear;

import java.util.Scanner;

public class LeapYear {
	int year;
	void checkYear()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		year=sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
		sc.close();
	}

}
