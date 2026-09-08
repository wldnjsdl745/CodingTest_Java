import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc = 1; tc <= test_case; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			int cnt = 0;
			
			while(true) {
				if (A <= B) {
				A += B;
				} else {
					B += A;
				}
				cnt++;
				if (A > N || B > N) break;
			}
			
			System.out.println(cnt);
		}
		
	}	// main
}