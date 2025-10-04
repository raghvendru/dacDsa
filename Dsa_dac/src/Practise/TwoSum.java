package Practise;
import java.util.*;

public class TwoSum {
	
	 public static ArrayList<int[]> twoSum2(int[] arr, int tar) {
	        int n = arr.length;
	        ArrayList<int[]> twoSum = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] + arr[j] == tar) {
	                    int[] ans = new int[2];
	                    ans[0] = arr[i];
	                    ans[1] = arr[j];
	                    twoSum.add(ans);
	                }
	            }
	        }
	        return twoSum;
	    }
	
    public static ArrayList<int[]> twoSum1(int[] arr, int tar) {
        int n = arr.length;
        ArrayList<int[]> twoSum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == tar) {
                    int[] ans = new int[2];
                    ans[0] = i;
                    ans[1] = j;
                    twoSum.add(ans);
                }
            }
        }
        return twoSum;
    }

    public static ArrayList<ArrayList<Integer>> twoSum(int[] arr, int tar) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> twoSum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == tar) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(i);
                    ans.add(j);
                    twoSum.add(ans);
                }
            }
        }
        return twoSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 3, 4, 4};
        int tar = 6;
        ArrayList<ArrayList<Integer>> ans = twoSum(arr, tar);
        ArrayList<int[]> ans1 = twoSum1(arr, tar);
        ArrayList<int[]> ans2 = twoSum2(arr, tar);

        System.out.println("Using ArrayList<int[]>:");
        for (int[] ele : ans1) {
            System.out.println(Arrays.toString(ele));
        }
        for (int[] ele : ans2) {
        	System.out.println(Arrays.toString(ele));
        }

        System.out.println("\nUsing ArrayList<ArrayList<Integer>>:");
        for (ArrayList<Integer> ele : ans) {
            System.out.println(ele);
        }
      
    }
}
