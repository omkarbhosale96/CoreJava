package equiTraingle;

public class Equilateral {

	float side;
	 Equilateral(float side)
	 {
		 this.side=side;
	 }
	 void area()
	 {
		 float area=(float) Math.pow(3, 1/2)*side*side;
		 area=area/4;
		 System.out.println("Area is:"+area);
	 }
}
