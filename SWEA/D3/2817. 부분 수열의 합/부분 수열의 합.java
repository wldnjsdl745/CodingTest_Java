import java.util.*;

class Solution{
    	static int N, K, sum;
	static int[] A;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			sum = 0;
			
			A = new int[N];
			for (int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			maxK(0, 0);		
			System.out.printf("#%d %d%n", tc, sum);
			
		}	//tc
		
	}	//main
	
	static void maxK(int idx, int cnt) {
		if (cnt == K) {
			sum++;
			return;
		}
		
		if (idx >= N) return;
		
		maxK(idx+1, cnt+A[idx]);
		maxK(idx+1, cnt);
	}
}