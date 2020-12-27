package calender;

public class Calender {
	
	int days;
	int years;
	int months;
	int weeks;
	int d;
	void convertDays(int days)
	{
		this.days=days;
		years=days/365;
		int rem1=days%365;
		months=rem1/30;
		int rem2=rem1%30;
		weeks=rem2/7;
		d=rem2%7;
		System.out.println(years+" years, "+months+" months, "+weeks+" weeks, "+d+" days");
	}

}
