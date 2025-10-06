package Recursion;

public class Fact {
	
	public static int fact(int n) {
		if(n==0 || n==1) return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		int n = 6;
		int ans = fact(6);
		System.out.println("fact is : "+ans);
	}

}
