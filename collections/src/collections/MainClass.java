package collections;

public class MainClass {
	public static void main(String[] args) {
		
		Point<Float> point1= new Point<Float>();
		point1.setX(6.5f);
		point1.setY(7.8f);
		
		System.out.println(point1.getX()+","+point1.getY());
		
		Point<Integer> point2= new Point<Integer>();
		point2.setX(6);
		point2.setY(7);
		
		System.out.println(point2.getX()+","+point2.getY());
		
		
		Point<Character> point3= new Point<Character>();
		point3.setX('a');
		point3.setY('b');
		
		System.out.println(point3.getX()+","+point3.getY());
	}

}
