package classes;

public class Quick extends Sort
{
	private static final int CUTTOFF = 10;
	
	public static void sort(Comparable[] a)
	{
		Shuffling.Shuffle(a);
		sort(a, 0, a.length - 1);
	}
	
	public static Comparable Select(Comparable[] a, int k)
	{
		Shuffling.Shuffle(a);
		
		int low = 0, high = a.length - 1;
		
		while (high > low)
		{
			int j = partition(a, low, high);
			
			if (j < k) low = j + 1;
			else if (j > k) high = j - 1;
			else return a[k];
		}
		
		return a[k];
	}
	
	private static void sort(Comparable[] a, int low, int high)
	{
		if (low >= high) return;
		
		if (high <= CUTTOFF - 1)
		{
			Insertion.Sort(a, low, high);
			return;
		}
		
		int j = partition(a, low, high);
		
		sort(a, low, j - 1);
		sort(a, j + 1, high);
	}
	
	private static void threeWaySort(Comparable[] a, int low, int high)
	{
		if (low >= high) return;
		
		int lt = low, gt = high, i = low;
		
		Comparable v = a[low];
		
		while (i < gt)
		{
			int cmp = a[i].compareTo(v);
			
			if (cmp < 0) exchange(a, lt++, i++);
			else if (cmp > 0) exchange(a, i, gt--);
			else ++i;
		}
		
		if (high <= CUTTOFF - 1)
		{
			Insertion.Sort(a, low, high);
			return;
		}
		
		int j = partition(a, low, high);
		
		sort(a, low, lt - 1);
		sort(a, gt + 1, high);
	}
	
	private static int partition(Comparable[] a, int low, int high)
	{
		int i = low, j = high + 1;
		
		while (true)
		{
			while (less(a[++i], a[low]))
			{
				if (i == high) break;
			}
			
			while (less(a[low], a[--j]))
			{
				if (j == low) break;
			}
			
			if (i >= j) break;
			
			exchange(a, i , j);
		}
		
		exchange(a, low, j);
		
		return j;
	}
}
