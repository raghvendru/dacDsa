package LinearSearch;

public class Multiplication {
	
	public static int[] isMult(int n) {
		int res = 1;
		int[] ans = new int[n-1];

		for(int i=1;i<=10;i++) {
			res = n*i;
			ans[i] = res;
		}
		return ans;
	}
	
	public static void isMult1(int n) {
		int res = 1;
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	
	}
	
	public static void main(String[] args) {
		int n = 12;
		int[] ans = isMult(n);
		for(int i=1;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		
		isMult1(13);
	}

}
