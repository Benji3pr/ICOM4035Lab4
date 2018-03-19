package sortersTesterClasses;

import java.util.Comparator;
import java.util.Random;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class Entero { 
    private int value; 
    public Entero(int v) { value = v; }
    public int getValue() { return value; } 
    public String toString() { return value + ""; }
    
	private static Random rnd; 

	
	public static void main(String[] args){
		rnd = new Random(101); 


		Entero[] arr;
		arr = randomValues(10);
		// generate random arrays is size i and test...

		showArray("\n ---Original array of size " + arr.length + " to sort:", arr); 

		Sorter<Entero> sorter = new BubbleSortSorter<Entero>();
		sorter.sort(arr, null);
		showArray("\n ---Original array of size " + arr.length + " to sort:", arr);

	}
	

	private static Entero[] randomValues(int i) {
		Entero[] a = new Entero[i]; 
		for (int j=0; j<i; j++) 
			a[j] = new Entero(rnd.nextInt(100)); 
		return a;
	}
	private static void showArray(String msg, Entero[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
 } 

