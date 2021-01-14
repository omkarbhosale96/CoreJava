package circle;

public class Circle {
	float pi=3.14f;
	float radius;
	Circle(float radius)
	{
		this.radius=radius;
	}
	float area()
	{
		return (pi*radius*radius);
	}
	float circumference()
	{
		return (2*pi*radius);
	}

}
