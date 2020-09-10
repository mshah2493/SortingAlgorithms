package classes;

public class Permutation 
{
	public static boolean IsSame(Comparable[] a, Comparable[] b)
	{
		if (a == null || b == null)
		{
			throw new NullPointerException();
		}
		
		if (a.length != b.length) return false;
		
		Shell.sort(a);
		Shell.sort(b);
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i]) return false;
		}
		
		return true;
	}
}
