package classes;

public class Intersection extends Sort
{
	public static int intersection(Comparable[] a, Comparable[] b)
	{
		if (a == null || b == null)
		{
			throw new NullPointerException();
		}
		
		int count = 0;
		int i = 0, j = 0;
		
		Shell.sort(a);
		Shell.sort(b);
		
		while (i < a.length && j < b.length)
		{
			if (less(a[i], b[j])) ++i;
			else if (less(b[j], a[i])) ++j;
			else 
			{
				++count;
				++i;
				++j;
			}
		}
		
		return count;
	}
}
