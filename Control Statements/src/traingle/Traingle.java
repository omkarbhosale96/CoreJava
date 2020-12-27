package traingle;

public class Traingle {
	
	int a,b,c;
	
	void checktraingle(int a,int b,int c)
	{
		if(a==b && b==c)
			System.out.println("Equilateral Traingle");
		else if(a==b || a==c)
			System.out.println("Isosceles traingle");
		else
			System.out.println("Scalene traingle");
	}

}
