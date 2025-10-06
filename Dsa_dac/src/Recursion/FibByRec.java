package Recursion;

public class FibByRec {
	static int[] arr = new int[100];
	
	
	
	public static int fib(int n) {
		if(n==0 || n==1) return 1;
		return fib(n-2)+fib(n-1);
	}
	
	
	//Memoization O(n)
	public static int fibByTab(int n) {
		long fib = 0;
		
		if(n==0 || n==1) return 1;
	
		else if(arr[(int) n] != -1) {
			return arr[(int)n];
		}
		else {
			fib = fibByTab(n-1) + fibByTab(n-2);
			arr[(int)n] = (int)fib;
			return (int)fib;
		}
	}
	
	public static void main(String[] args) {
		int n = 45;
		int ans = fib(n);
		long before = System.nanoTime();
		System.out.println("fib is : " + ans);
		long after = System.nanoTime();
		System.out.println("tota time by rec: "+(after-before));

		
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		
		long before1 = System.nanoTime();
		System.out.println("by tab fib is: " +fibByTab(n) );
		long after1 = System.nanoTime();
		
		System.out.println("tota time : "+(after1-before1));

	}

}
