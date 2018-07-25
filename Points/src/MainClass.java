import java.awt.Point;

public class MainClass {

	

	private static final Point NULL = null;
	int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point [] points;
		points=new Point[3];
		
		points[0]=new Point();
		points[2]=new Point();
		
		points[0].x=2;
		points[0].x=4;
		System.out.println(points[0].x+" "+points[0].x);
		points[0].y=3;
		
		points[2].x=6;
		points[2].y=8;
		
		
		for(Point point:points) {
			
			if(point!= NULL)
			{
				System.out.println(point.x+" "+point.y);
			}
		}
		
		
		

	}

}
