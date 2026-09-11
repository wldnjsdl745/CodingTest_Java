import java.util.*;

class Solution {
	static int N, sum;
	static int[] A;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc = 1; tc<=test_case; tc++) {
			N = sc.nextInt();
			A = new int[N];
			sum = 0;
			
			// 채워넣기
			for (int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}
			
			int output = totalCnt(0);
			System.out.printf("#%d %d%n", tc, output);
		}	//tc
	}	//main
	
	static int totalCnt(int num) {
		if (num >= N) return sum;
		for (int i=0; i<N; i++) {
			sum += A[num]%A[i];
		}
		return totalCnt(++num);
	}
}