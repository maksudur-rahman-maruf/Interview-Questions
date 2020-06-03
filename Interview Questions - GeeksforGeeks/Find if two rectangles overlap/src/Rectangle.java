class Point 
{
	int x;
	int y;
}


public class Rectangle {
	
	static boolean doOverlap(Point l1, Point l2, Point r1, Point r2)
	{
		// If one rectangle is on left side of other  
		if(l1.x >= r2.x || l2.x >= r1.x)
		{
			return false;
		}
		
		// If one rectangle is above of other
		if(l1.y <= r2.y || l2.y <= r1.y)
		{
			return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Point l1 = new Point();
		Point r1 = new Point();
		
		Point l2 = new Point();
		Point r2 = new Point();
		
		l1.x = 0; l1.y = 10; r1.x = 10; r1.y = 0;
		l2.x = 5; l2.y = 5;  r2.x = 15; r2.y = 0; 
		
		if(doOverlap(l1,l2,r1,r2))
		{
			System.out.println("Rectangles overlap!");
		}
		else
		{
			System.out.println("Rectangles don't overlap!");
		}
		
		

	}

}
