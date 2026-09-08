import java.util.*;
import java.io.FileInputStream;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc = 1; tc <= test_case; tc++) {
			
			 int N = sc.nextInt();
			 int K = sc.nextInt();
			 int[] mid = new int[N];
			 int[] fin = new int[N];
			 int[] perform = new int[N];
			 double[] scores = new double[N];
			 String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
			 
			 
			 
			 for (int i=0; i<N; i++) {
				 mid[i] = sc.nextInt();
				 fin[i] = sc.nextInt();
				 perform[i] = sc.nextInt();
			 }
			 
			 for (int i=0; i<N; i++) {
				 scores[i] = (mid[i]*35 + fin[i]*45 + perform[i]*20)/100.0;
			 }
			 
			 double sScore = scores[K-1];
			 
			 Arrays.sort(scores);
			 int cnt = 0;
			 
			 for (int i=0; i<N; i++) {
				 if (scores[i] == sScore) break;
				 cnt++;
			 }
			 
			 System.out.printf("#%d %s%n", tc, score[cnt / (N / 10)]);
			 
		}	//tc
		
	}	// main
}