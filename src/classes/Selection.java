package classes;

public class Selection extends Sort
{
	public static void Sort(Comparable [] a) 
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		int N = a.length;
		
		for (int i = 0; i < N - 1; ++i)
		{
			int min = i;
			
			for (int j = i + 1; j < N; ++j)
			{
				if (less(a[j], a[min]))
				{
					min = j;
				}
			}
			
			exchange(a, i, min);
		}
	}
}
