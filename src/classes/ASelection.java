package classes;

public abstract class ASelection 
{
	public abstract void sort(Comparable[] a);
	
	public boolean isSorted(Comparable[] a)
	{
		for (int i = 1; i < a.length; ++i)
		{
			if (less(a[i], a[i - 1])) return false;
		}
		
		return true;
	}
	
	protected boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b) < 0;
	}
	
	protected void exchange(Comparable[] a, int i, int j)
	{
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
