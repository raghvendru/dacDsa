package BinarySearch;

public class BsOfRecIte {
	
	public static int searchByRec(int[] nums,int tar,int low,int high) {
		int n = nums.length;
		int mid = (low+high)/2;
		if(low>high) return -1;
		if(nums[mid]<tar) {
			return searchByRec(nums,tar,mid+1,high);
			 
		}else if (nums[mid]>tar) {
			return searchByRec(nums,tar,low,mid-1);
		}
			return mid;
	}
	
	
	public static int search(int[] nums,int tar) {
		int n = nums.length;
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid] < tar) {
				low = mid+1;
			}
			else if(nums[mid]>tar) {
				high = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,9,10,12};
		int n = nums.length;
		int tar = 9;
		int ans = search(nums,tar);
		System.out.println("element found at:"+ans);
		
		int ansR = searchByRec(nums,tar,0,n-1);
		System.out.println("search by rec ==>ele found at :"+ansR);
		
	}

}
