package classes;

public class Sort 
{	
	protected static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high)
	{
		assert isSorted(a, low, mid);
        assert isSorted(a, mid + 1, high);
        
		int i = low, j = mid + 1;
		
		for (int k = low; k <= high; k++) 
		{
			if (i > mid) aux[k] = a[j++];
			else if (j > high) aux[k] = a[i++];
			else if (less(a[j], a[i])) aux[k] = a[j++];
			else aux[k] = a[i++];
		}
		
        assert isSorted(aux, low, high);
	}
	
	protected static boolean isSorted(Comparable[] a)
	{
		for (int i = 1; i < a.length; ++i)
		{
			if (less(a[i], a[i - 1])) return false;
		}
		
		return true;
	}
	
	protected static boolean isSorted(Comparable[] a, int lo, int hi) 
	{
        for (int i = lo + 1; i <= hi; i++)
        {
        	if (less(a[i], a[i-1])) return false;
        }
            
        return true;
    }

	
	protected static boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b) < 0;
	}
	
	protected static void exchange(Comparable[] a, int i, int j)
	{
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
