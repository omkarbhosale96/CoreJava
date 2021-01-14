package areasOfAngles;

public class Areas {
	
	int side,length,width;
	float height,base,half;
	
	void area(int a)
	{
		side=a;
		int sqArea=side*side;
		System.out.println("Area of square:"+sqArea);
	}
	void area(int a,int b)
	{
		length=a;
		width=b;
		int recArea=length*width;
		System.out.println("Area of rectangle:"+recArea);
	}
	void area(float a,float b,float c)
	{
		half=a;
		height=b;
		base=c;
		float trArea=(float) (half*height*base);
		System.out.println("Area of traingle:"+trArea);
	}

}
