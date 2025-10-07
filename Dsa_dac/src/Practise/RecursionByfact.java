package Practise;

public class RecursionByfact {
	static int[] arr = new int[100];

	public static int recByMem(int n) {
		if (n == 0 || n == 1)
			return n;

		else if (arr[(int) n] != -1) {

			return arr[(int) n];
		} else {
			int fib = recByMem(n - 1) + recByMem(n - 2);
			arr[(int) n] = fib;
			return fib;

		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		int n = 35;
		int ans = recByMem(n);
		System.out.println(ans);
	}

}
