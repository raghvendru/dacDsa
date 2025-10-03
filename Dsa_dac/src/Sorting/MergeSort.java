package Sorting;

import java.util.*;

public class MergeSort {

	public static int[] mergeSort(int[] arr) {
		int n = arr.length;
		msHelper(arr, 0, n - 1);
		return arr;
	}

	public static void msHelper(int[] arr, int l, int h) {
		int m = (l + h) / 2;
		if (l == h) return;
		msHelper(arr, l, m);
		msHelper(arr, m + 1, h);
		merge(arr, l, m, h);
	}

	public static void merge(int[] arr, int l, int m, int h) {
		ArrayList<Integer> ans = new ArrayList<>();
		int i = l;
		int j = m + 1;
		while (i <= m && j <= h) {
			if (arr[i] <= arr[j]) {
				ans.add(arr[i]);
				i++;
			} else {
				ans.add(arr[j]);
				j++;
			}
		}
		while(i<=m) {
			ans.add(arr[i]);
			i++;
		}
		while(j<=h) {
			ans.add(arr[j]);
			j++;
		}
		
		for(int k=l;k<=h;k++) {
			arr[k] = ans.get(k-l);
		}

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
	    int[] ans = mergeSort(arr);
	    for(int i=0;i<ans.length;i++) {
	    	System.out.println(ans[i]);
	    }
	}
}
