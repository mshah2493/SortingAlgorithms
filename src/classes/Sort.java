package classes;

import java.util.Comparator;

public class Sort 
{		
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
	
	protected static boolean less(Comparator comparator, Object a, Object b)
	{
		return comparator.compare(a, b) < 0;
	}
	
	protected static void exchange(Comparable[] a, int i, int j)
	{
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	protected static void exchange(Object[] a, int i, int j)
	{
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
