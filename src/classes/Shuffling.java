package classes;

import edu.princeton.cs.algs4.StdRandom;

public class Shuffling extends Sort
{
	public static void Shuffle(Comparable[] a)
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		
		int N = a.length;
		int r;
		
		for (int i = 1; i < N; i++)
		{
			r = StdRandom.uniform(i + 1);
			exchange(a, i, r);
		}
	}
}
