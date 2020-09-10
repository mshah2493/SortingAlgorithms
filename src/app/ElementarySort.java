package app;

import java.util.Arrays;

import classes.DutchNationalFlag;
import classes.Insertion;
import classes.Intersection;
import classes.Permutation;
import classes.Selection;
import classes.Shell;
import classes.Shuffling;

public class ElementarySort 
{
	public static void main(String[] args) 
	{
		System.out.println("===============Selection===============");
		Integer[] intArray = new Integer[] { 1, -9, 0, 9, 5};
		Selection.Sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		String[] str = new String[] { "B", "A", "AB", "D", "C"};
		Selection.Sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Insertion===============");
		intArray = new Integer[] { 1, -9, 0, 9, 5};
		Insertion.Sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		str = new String[] { "B", "A", "AB", "D", "C"};
		Insertion.Sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Shell===============");
		intArray = new Integer[] { 9, 8, 3, 7, 5 , 6, 4 , 1, 0};
		Shell.sort(intArray); 
		System.out.println(Arrays.toString(intArray));
		
		str = new String[] { "B", "A", "AB", "D", "C", "BC"};
		Shell.sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Shuffle===============");
		Shuffling.Shuffle(intArray); 
		System.out.println(Arrays.toString(intArray));
		
		Shuffling.Shuffle(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Permutation===============");
		Integer[] array = intArray;
		System.out.println(Permutation.IsSame(intArray, array));
		array = new Integer[] { 9, 8, 3, 7, 5 , 6, 4 , 1, 10};
		System.out.println(Permutation.IsSame(intArray, array));
		
		System.out.println("===============Intersection===============");
		array = intArray;
		System.out.println(Intersection.intersection(intArray, array));
		array = new Integer[] { 9, 8, 3, 7, 5 , 6, 4 , 1, 10};
		System.out.println(Intersection.intersection(intArray, array));
		
		System.out.println("===============Dutch National Flag===============");
		array = new Integer[] { 1, 1, 2, 2, 0, 0, 1, 0, 1, 0, 2, 1};
		DutchNationalFlag.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
