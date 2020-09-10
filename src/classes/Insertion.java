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
}
