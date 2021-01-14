package shapeCircle;

public class Area {

	public static void main(String[] args) {
		ShapeCircle s=new ShapeCircle(12f);
		
		float area=s.pi*s.radius*s.radius;
		System.out.println(area);

	}

}
