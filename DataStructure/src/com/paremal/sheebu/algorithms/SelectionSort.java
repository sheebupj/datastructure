package com.paremal.sheebu.algorithms;

public class SelectionSort {
	
	int[] selectionSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			int index=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[index]>array[j]) {
					index=j;
				}
			}
			int temp=array[index];
			array[index]=array[i];
			array[i]=temp;
		}
	return array;
	}
	public static void main(String[] args) {
		int[] a= {8,-6,-9,2,5};
		SelectionSort selsort= new SelectionSort();
		a=selsort.selectionSort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}
	
	

}
