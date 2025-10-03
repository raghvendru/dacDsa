package LinearSearch;

import java.util.*;

public class LinearSearch {

	public static void ls(int[] arr, int search) {
		int n = arr.length;
		boolean found = false;
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == search) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("element found at : " + i);
		} else {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		while (true) {
			System.out.println("enter element u wanna search");
			int search = sc.nextInt();

			ls(arr, search);
		}

	}

}
