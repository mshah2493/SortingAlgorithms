package app;

import java.util.Arrays;

import classes.CountingInversions;
import classes.Merge;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		System.out.println("===============Merge===============");
		Integer[] intArray = new Integer[] { 1, -9, 0, 9, 5};
		Merge.Sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		String[] str = new String[] { "B", "A", "AB", "D", "C"};
		Merge.Sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============CountingInversions===============");
		intArray = new Integer[] { 1, -9, 0, 9, 5, 4, 3};
		System.out.println(CountingInversions.GetInversion(intArray));
		
		str = new String[] { "B", "A", "AB", "D", "C", "BB"};
		System.out.println(CountingInversions.GetInversion(str));
	}
}
