package rectangle1;

public class Rectangle1 {

	int length,breadth;
	Rectangle1()
	{
		
	}
	Rectangle1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	Rectangle1(int length)
	{
		this.length=length;
		breadth=length;
	}
	void area()
	{
		int area=length*breadth;
		System.out.println("Area:"+area);
	}
	
}
