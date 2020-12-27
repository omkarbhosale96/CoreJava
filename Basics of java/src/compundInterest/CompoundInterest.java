package compundInterest;

public class CompoundInterest {
	
	double compoundInt;
	double P;
	double r;
	double n;
	double t;
	
	void getcompoundInterest(int P,double d,int n,int t)
	{
		
		compoundInt=P*Math.pow(1+(d/n), n*t);
		compoundInt=compoundInt-P;
		System.out.println("Compound Interest is:"+compoundInt);
	}

}
