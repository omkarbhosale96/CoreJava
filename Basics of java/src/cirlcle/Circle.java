package cirlcle;

public class Circle {
	
	float radius;
	float pi= 3.14f;
	Circle(float radius)
	{
		this.radius=radius;
	}
	void perimeter()
	{
		System.out.println("The perimeter is:"+2*pi*radius);
	}
	void area()
	{
		System.out.println("The area is:"+pi*radius*radius);
	}

}
