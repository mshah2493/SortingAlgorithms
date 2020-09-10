package classes;

public class Shell extends Sort
{
	public static void Sort(Comparable [] a) 
	{
		if (a == null)
		{
			throw new IllegalAccessError();
		}
		
		int N = a.length;		
		int h = 1;
		
		while(h < N/3)
		{
			h = 3 * h + 1;
		}
		
		while (h >= 1)
		{
			for (int i = h; i < N; i++)
			{
				for (int j = i; j >= h && less(a[j], a[j - h]); j-=h)
				{
					exchange(a, j, j - h);
				}
			}
			
			h = h / 3;
		}
	}
}
