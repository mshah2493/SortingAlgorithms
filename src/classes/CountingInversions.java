package classes;

public class CountingInversions
{
	static int count;
	
	public static int GetInversion(Comparable[] a)
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		count = 0;
		getInversion(a, 0, a.length - 1);
		
		return count;
	}
	
	private static void getInversion(Comparable[] a, int low, int high)
	{
		 if (high <= low) return;
		 
		 int mid = low + (high - low) / 2;
		 
		 getInversion(a, low, mid);
		 getInversion(a, mid+1, high);
		 
		 count(a, low, mid, high);
	 }
	
	private static boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b) < 0;
	}
	
	private static void count(Comparable[] a, int low, int mid, int high)
	{
		int i = low, j = mid + 1;
		
		for (int k = low; k <= high; k++) 
		{
			if (i > mid) ++j;
			else if (j > high) ++i;
			else if (less(a[j], a[i])) 
			{
				++j;
				++count;
			}
			else ++i;
		}
	}
}
