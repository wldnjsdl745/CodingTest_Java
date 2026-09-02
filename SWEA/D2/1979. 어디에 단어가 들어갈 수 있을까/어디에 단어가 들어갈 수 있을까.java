import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int test_case = sc.nextInt();	
		 
		 for (int i=1; i<=test_case; i++) {
			 int N = sc.nextInt();
			 int K = sc.nextInt();
			 int[][] puzzle = new int[N][N];
			 int rowCheck = 0;
			 int columnCheck = 0;
			 int finalCheck = 0;
			 
			 // 입력
			 for (int j=0; j<N; j++) {
				 for (int k=0; k<N; k++) {
					 puzzle[j][k] = sc.nextInt();
				 }
			 }
			 
			 //체크
			 for (int j=0; j<N; j++) {
				 for (int k=0; k<N; k++) {
					 
					 if (k == N-1) {
						 // 가로
						 if (puzzle[j][k] == 1) { rowCheck++; }
						 if (rowCheck == K) { finalCheck++; }
						 rowCheck = 0;
						 
						 //세로
						 if (puzzle[k][j] == 1) { columnCheck++; }
						 if (columnCheck == K) { finalCheck++; }
						 columnCheck = 0;
						 
					 } else {
						 // 가로
						 if (puzzle[j][k] == 1) {
							 rowCheck++; 
						 } else if (puzzle[j][k] == 0) {
							 if (rowCheck == K) { finalCheck++; }
							 rowCheck=0;
						 }
						 
						 //세로
						 if (puzzle[k][j] == 1) {
							 columnCheck++; 
						 } else if (puzzle[k][j] == 0) {
							 if (columnCheck == K) { finalCheck++; }
							 columnCheck=0;
						 }
						 
					 }
					 
				 }
			 }
			 
			 System.out.printf("#%d %d%n", i, finalCheck);
		 }
	}	//main
}