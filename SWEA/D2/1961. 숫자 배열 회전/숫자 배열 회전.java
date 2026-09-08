import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc = 1; tc <= test_case; tc++) {
			 int N = sc.nextInt();
			 int[][] nums = new int[N][N];
			 
			 for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					nums[i][j] = sc.nextInt();
				}
			 }
			 
			 System.out.println("#" + tc);
			 for (int i=0; i<N; i++) {
				 for (int j=N-1; j>=0; j--) {
					 System.out.print(nums[j][i]);
				 }
				 System.out.print(" ");
				 
				 for (int j=N-1; j>=0; j--) {
					 System.out.print(nums[N-i-1][j]);
				 }
				 System.out.print(" ");	
				 
				 for (int j=N-1; j>=0; j--) {
					 System.out.print(nums[N-j-1][N-i-1]);
				 }
				 System.out.print(" ");
				 System.out.println();
			 }
			 
		}	//tc
		
	}	// main
}