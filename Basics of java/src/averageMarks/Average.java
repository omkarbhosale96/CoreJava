package averageMarks;

public class Average {

	int sub1,sub2,sub3,sub4,sub5,sub6;
	Average(int a,int b,int c,int d,int e,int f)
	{
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
		sub5=e;
		sub6=f;
	}
	void getAverage()
	{
		float avg=sub1+sub2+sub3+sub4+sub5+sub6;
		avg=avg/6;
		System.out.println("Average:"+avg);
	}
}
