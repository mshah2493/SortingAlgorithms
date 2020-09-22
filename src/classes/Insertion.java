package classes;

public class Insertion extends Sort
{
	public static void Sort(Comparable [] a) 
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		int N = a.length;
		
		for (int i = 0; i < N; ++i)
		{
			for (int j = i; j > 0; --j)
			{
				if (less(a[j], a[j - 1]))
				{
					exchange(a, j, j - 1);
				}
				else
				{
					break;
				}
			}
		}
	}
	
	 public static void Sort(Comparable[] a, int low, int high) 
	 {
		 for (int i = low + 1; i < high; i++) 
		 {
			 for (int j = i; j > low && less(a[j], a[j-1]); j--) 
			 {
				 exchange(a, j, j-1);
			 }
	     }
	 }	
}
