package sortersTesterClasses;

import java.util.Random;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;

public class IncDecTester {
	private static Random rnd;

	public static void main(String args[]){
		Integer[] arr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		showArray("\n ---Original array of size " + arr.length + " to sort:", arr);
		Sorter<Integer> sorter = new BubbleSortSorter<Integer>();
		sorter.sort(arr, new IntegerComparator1());
		showArray("\n ---Sorting Using IntegerComparator1 (Increasing order) with " + arr.length + " elements sorted:", arr);
		sorter.sort(arr, new IntegerComparator2());
		showArray("\n ---Sorting Using IntegerComparator2 (Decreasing order) with " + arr.length + " elements sorted:", arr);



	}
	private static Integer[] randomValues(int i) {
		Integer[] a = new Integer[i]; 
		for (int j=0; j<i; j++) 
			a[j] = new Integer(rnd.nextInt(100)); 
		return a;
	}
	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
}
