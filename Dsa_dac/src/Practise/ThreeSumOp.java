package Practise;
import java.util.*;

public class ThreeSumOp {
	
	public static List<List<Integer>> ts(int[] arr,int tar){
		
		Set<List<Integer>> ans1 = new HashSet<>();

		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(i>0 && arr[i] == arr[i-1]) continue;
			int j = i+1;
			int k = n-1;
			while(j<k) {
				int sum =arr[i]+arr[j]+arr[k];
				if(sum<0) j++;
				else if(sum>0) k--;
				else {
					List<Integer> al = Arrays.asList(arr[i],arr[j],arr[k]);
					ans1.add(al);
					j++;
					k--;
					while(j<k && arr[j] == arr[j-1]) j++;
					while(j<k && arr[k] == arr[k+1]) k--;
					
					
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(ans1);
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
		int tar = 0;
		List<List<Integer>> ans = ts(arr,tar);
		for(List<Integer> al:ans) {
			System.out.println(al);
		}
		
	}

}
