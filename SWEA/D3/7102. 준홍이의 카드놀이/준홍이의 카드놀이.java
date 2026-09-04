import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int i=1; i<=test_case; i++) {
			System.out.print("#" + i + " ");
			int N = sc.nextInt();
			int M = sc.nextInt();
			int max = 0;
			int[] sumArr = new int[N+M+1];
			
			for (int j=1; j<=N; j++) {
				for (int k=1; k<=M; k++) {
					sumArr[j+k]++;
				}
			}		
			
			for (int j=0; j<sumArr.length; j++) {
				if (max < sumArr[j]) {
					max = sumArr[j];
				}
			}
			
			for (int j=0; j<sumArr.length; j++) {
				if (sumArr[j] == max) {
					System.out.print(j+ " ");
				}
			}
			
			System.out.println();
		}	// test_case
	}	// main
}