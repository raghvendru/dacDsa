package Sorting;
import java.util.*;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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
	    int[] ans = bubbleSort(arr);
	    for(int i=0;i<ans.length;i++) {
	    	System.out.println(ans[i]);
	    }
 		
	}

}
