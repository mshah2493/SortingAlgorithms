package classes;

public class DutchNationalFlag extends Sort
{
	public static void sort(Integer [] a) 
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		if (a.length < 2) 
		{
	        return;
	    }
		
		int low = 0, mid = 0;
		int high = a.length - 1;		
		
		while (mid <= high)
		{
			if (a[mid] == 0)
			{
				exchange(a, mid , low);
				++low;
				++mid;
			}
			else if (a[mid] == 2)
			{
				exchange(a, mid, high);
				--high;
			}
			else
			{
				++mid;
			}
		}
	}
}
