import java.util.*;

class Solution{
	static int N, L, max;
	static int[] score, kcal;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			N = sc.nextInt();
			L= sc.nextInt();
			max = 0;
			
			score = new int[N];
			kcal = new int[N];
			
			for (int i=0; i<N; i++) {
				score[i]= sc.nextInt();
				kcal[i] = sc.nextInt();
			}
			
			maxBurger(0,0,0);
			System.out.printf("#%d %d%n", tc, max);
			
		}	// tc
	}	//main
	
	static void maxBurger(int idx, int currentScore, int currentKcal) {
		if (currentKcal> L) return;
		if (idx >= N) {
			max = Math.max(max, currentScore);
			return;
		}
		
		maxBurger(idx+1, currentScore+score[idx], currentKcal + kcal[idx]);
		maxBurger(idx+1, currentScore, currentKcal);
	}
	
}