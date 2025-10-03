package Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int mini = i;
			for(int j=i;j<n;j++) {
				if(arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("enter elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    int[] ans = selectionSort(arr);
	    for(int i=0;i<ans.length;i++) {
	    	System.out.println(ans[i]);
	    }
	}

}
