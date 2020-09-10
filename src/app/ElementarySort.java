package app;

import java.util.Arrays;

import classes.Insertion;
import classes.Selection;
import classes.Shell;
import classes.Shuffling;

public class ElementarySort 
{
	public static void main(String[] args) 
	{
		System.out.println("===============Selection===============");
		Integer[] integer = new Integer[] { 1, -9, 0, 9, 5};
		Selection.Sort(integer);
		System.out.println(Arrays.toString(integer));
		
		String[] str = new String[] { "B", "A", "AB", "D", "C"};
		Selection.Sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Insertion===============");
		integer = new Integer[] { 1, -9, 0, 9, 5};
		Insertion.Sort(integer);
		System.out.println(Arrays.toString(integer));
		
		str = new String[] { "B", "A", "AB", "D", "C"};
		Insertion.Sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Shell===============");
		integer = new Integer[] { 9, 8, 3, 7, 5 , 6, 4 , 1, 0};
		Shell.Sort(integer); 
		System.out.println(Arrays.toString(integer));
		
		str = new String[] { "B", "A", "AB", "D", "C", "BC"};
		Shell.Sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("===============Shuffle===============");
		Shuffling.Shuffle(integer); 
		System.out.println(Arrays.toString(integer));
		
		Shuffling.Shuffle(str);
		System.out.println(Arrays.toString(str));
	}
}
