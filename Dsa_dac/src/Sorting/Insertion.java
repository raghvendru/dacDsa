package Sorting;

import java.util.Scanner;

public class Insertion {
	public static int[] inSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
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
	    int[] ans = inSort(arr);
	    for(int i=0;i<ans.length;i++) {
	    	System.out.println(ans[i]);
	    }
	}

}
