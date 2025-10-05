package Practise;
import java.util.*;
public class ThreeSum {
	
	public static ArrayList<ArrayList<Integer>> ts(int[] arr,int tar){
		
		int n = arr.length;
		Set<ArrayList<Integer>> hs = new HashSet<>();
		for(int i=0;i<n;i++) {
			HashSet<Integer> h = new HashSet<>();
			for(int j = i+1;j<n;j++) {
				int sum = tar-(arr[i]+arr[j]);
				if(h.contains(sum)) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[j]);
					temp.add(sum);
					Collections.sort(temp);
					hs.add(temp);
				}
				h.add(arr[i]);
			}
			
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>(hs);	
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
		int tar = 0;
		ArrayList<ArrayList<Integer>> ans = ts(arr,tar);
		for(ArrayList<Integer> ele:ans) {
			System.out.println(ele);
		}
		
	}

}
