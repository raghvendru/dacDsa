package Sorting;

import java.util.Scanner;

public class QuickSort {
	 public static int[] quickSort(int[] nums) {
	        int n = nums.length;
	        qsHelper(nums,0,n-1);
	        return nums;

	    }

	    public static void qsHelper(int[] nums,int l,int h){
	        if(l<h){
	            int pi = pivot(nums,l,h);
	            qsHelper(nums,l,pi-1);
	            qsHelper(nums,pi+1,h);
	        }
	    }

	    public static int pivot(int[] nums,int l,int h){
	        int pivot = nums[l];
	        int i = l;
	        int j = h;

	        while(i<j){
	            while(i<=h-1 && nums[i]<=pivot) i++;
	            while(j>=l+1 && nums[j]>pivot) j--;
	            if(i<j){
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	            }
	        }

	        int temp = nums[j];
	        nums[j] = nums[l];
	        nums[l] = temp;
	        return j;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("enter elements to sort by quick");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    int[] ans = quickSort(arr);
	    for(int i=0;i<ans.length;i++) {
	    	System.out.println(ans[i]);
	    }
		
	}

}
