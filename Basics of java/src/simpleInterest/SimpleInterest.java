package simpleInterest;

public class SimpleInterest {
	
	
	float P;
	int r;
	int t;
	float si;
	void getValues(float P,int r,int t)
	{
		
		this.P=P;
		this.r=r;
		this.t=t;
				
	}
	void calculateSI()
	{
		si=P*r*t/100f;
		System.out.println("Simple Interest:"+si);
	}

}
