package room;

public class Room {
	
	int length,width,height,area,floorArea;
	
	void whiteWashingArea()
	{
		 area=2*(length*height) + 2*(width*height);
		 System.out.println("White wash Area:"+area);
	}
	void whiteWashingCost()
	{
		int cost=area*80;
		System.out.println("White Washing cost:"+cost);
	}
	void flooringCost()
	{
		floorArea=length*width;
		int geo=200*floorArea;
		int cement=100*floorArea;
		System.out.println("Geometric flooring cost:"+geo);
		System.out.println("Cement flooring cost:"+cement);
	}

}
