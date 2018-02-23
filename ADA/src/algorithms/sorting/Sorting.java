package algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		int[] array = {1,4,5,6,3,2,5,7,8,9,0,4,5};
		
		int[] array1 = {1,2,3,4};
		
		selectionSort(array);
		bubbleSort(array);
		//insertionSort(array);
		//System.out.println(array.toString());
	}
	


	    public static void sort(int[] num){
	        
	        for(int i=0;i<num.length-1;i++){
	            for(int j=1;i<num.length;i++){
	            
	                if(num[i]>num[j]){
	                    int temp = num[i];
	                    num[i]=num[j];
	                    num[j]=temp;
	                }
	        }
	        }
	    }
	
	/*private void printData() {
		
		
	}*/
	
	private static void selectionSort(int[] array) {
		
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
	
private static void bubbleSort(int[] array) {
		
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

private static void insertionSort(int[] array) {
	
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
