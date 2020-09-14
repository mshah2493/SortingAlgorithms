package classes;

import java.util.Comparator;

public class Point2D
{
	private final double x;
	private final double y;
	
	public Point2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	private static int ccw(Point2D a, Point2D b, Point2D c)
	{
		double area = (b.x - a.x) * (c.y - a.y) - (b.x - a.x) * (c.x - a.x);
		
		if (area < 0) return -1; // clockwise
		else if (area > 0) return 1; // counter-clockwise
		else return 0; //collinear
	}
	
	private class PolarOder implements Comparator <Point2D>
	{
		@Override
		public int compare(Point2D o1, Point2D o2) 
		{
			double dx1 = o1.x - x;
			double dy1 = o1.y - y;
			double dx2 = o2.x - x;
			double dy2 = o2.y - y;
			
			if (dy1 == 0 && dy2 == 0) 
			{
				if (dx1 >= 0 && dx2 < 0) return -1; // o1 above p and o2 below p
                else if (dx2 >= 0 && dx1 < 0) return +1; // o1 below p and o2 above p
                else return  0; // collinear
			}
			else if (dy1 >= 0 && dy2 < 0) 
			{
				return -1; // o1 above p and o2 below p
			}
			else
			{
				return -ccw(Point2D.this, o1, o2); // both above or below
			}
		}
	}
}