package classes;

import java.util.Comparator;

public class Merge extends Sort
{
	private static final int CUTOFF = 7;
	private static Comparable[] aux;
	
	public static void Sort(Comparable [] a) 
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		Comparable[] aux = a.clone();
		sort(a, aux, 0, a.length - 1);
		assert isSorted(a);
	}
	
	public static void Sort(Comparable [] a, Comparator comparator) 
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		Comparable[] aux = a.clone();
		sort(a, aux, 0, a.length - 1, comparator);
		assert isSorted(a);
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int low, int high)
	{
		 if (high <= low) return;
		 
		 if (high <= low + CUTOFF - 1)
		 {
			 Insertion.Sort((Comparable[]) a);
			 return;
		 }
		 
		 int mid = low + (high - low) / 2;
		 
		 sort(aux, a, low, mid);
		 sort(aux, a, mid+1, high);
		 
		 if (!less(a[mid + 1], a[mid])) 
		 {
			 System.arraycopy(a, low, aux, low, high - low + 1);
			 return;
		 }
		 
		 merge(a, aux, low, mid, high);
	 }
	
	private static void sort(Object[] a, Object[] aux, int low, int high, Comparator comparator)
	{
		 if (high <= low) return;
		 
		 if (high <= low + CUTOFF - 1)
		 {
			 Insertion.Sort((Comparable[]) a);
			 return;
		 }
		 
		 int mid = low + (high - low) / 2;
		 
		 sort(aux, a, low, mid, comparator);
		 sort(aux, a, mid+1, high, comparator);
		 
		 if (!less((Comparable) a[mid + 1], (Comparable) a[mid])) 
		 {
			 System.arraycopy(a, low, aux, low, high - low + 1);
			 return;
		 }
		 
		 merge(a, aux, low, mid, high, comparator);
	 }
}
