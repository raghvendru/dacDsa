package Practise;
import java.util.*;
public class TwoSumOptimal {
	
	public static ArrayList<ArrayList<Integer>> ts(int[] arr,int tar){
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int n = arr.length;
		int l = 0,r = n-1;
		while(l<r) {
			int sum = arr[l] + arr[r];
			if(sum == tar) {
				ArrayList<Integer> ts = new ArrayList<>();
				ts.add(l);
				ts.add(r);
				ans.add(ts);
				l++;
				r--;
			}
			else if(sum<tar) l++;
			else r--;
		}
		return ans;
		
		
	}
	
	
	public static void main(String[] args) {
		 int[] arr = {1, 5, 2, 3, 3, 4, 4};
	        int tar = 6;
	        ArrayList<ArrayList<Integer>> ans = ts(arr, tar);
	        for (ArrayList<Integer> ele : ans) {
	            System.out.println(ele);
	        }
	}
	

}
