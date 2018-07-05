package algorithms.sorting;

import java.util.Collection;

/*
 * Author: bk2arya
 */
public class Sorting {
	
	//Main method is just to test the different sorting techniques written here
	public static void main(String[] args) {
		
		int[] array = {1,4,5,6,3,2,5,7,8,9,0,4,5};
		Collection c1 = null;
		selectionSort(array);
		bubbleSort(array);
		//insertionSort(array);
		//System.out.println(array.toString());
	}
	
/*performs Classic Selection Sort.
 * accepts Integer Array as argument.
 * Time: O(n2)
 * Space: O(1)
 * swaps: O(n) hence used in places where least memory write operations are required
 */
public static void selectionSort(int[] array) {
		
		int len = array.length;
		int temp;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				
				if(array[i]>array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}

	}
	
/*performs Classic Bubble Sort.
 * accepts Integer Array as argument.
 * * Time: O(n2)
 * Space: O(1)
 * swaps: More swaps, Hence used in Computer graphics to detect even small changes
 * Stable and hence it is used more
 */
public static void bubbleSort(int[] array) {
		
		int len = array.length;
		int temp;
		boolean swapped;
	
		for(int i=0;i<len-1;i++) {
			
			swapped=false;
			for(int j=0;j<len-1-i;j++) {
				
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swapped=true;
				}
				
			}
			
			if(swapped==false)
				break;
		}

	}

/*performs Classic Insertion Sort.
 * accepts Integer Array as argument.
 * * Time: O(n2)
 * Space: O(1)
 * Best used when minimum number of elements needs to be sorted
 * Boundary conditions: Takes maximum time to sort when in reverse order
 * 						Takes v. less time when sorting of v. few elements
 */
public static void insertionSort(int[] array) {
	
	//{3,1,2,4,5}
	for(int i=1; i<array.length;i++) {
		
		int key=array[i];
		int j=i-1;
		
		while(j>=0 && array[j]>key) {
			array[j+1]=array[j];
			j=j-1;
		}
		array[j+1]=key;
		
	}
}
	
	
}
