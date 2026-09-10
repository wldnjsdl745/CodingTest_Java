import java.util.*;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			boolean flag = false;
			
			for (int i=0; i<N; i++) {
				if (M%2 == 0) {
					flag = true;
					break;
				}
				M/=2;
			}
			
			System.out.println("#" + tc + " " + (flag ? "OFF" : "ON"));
		}
	}
}