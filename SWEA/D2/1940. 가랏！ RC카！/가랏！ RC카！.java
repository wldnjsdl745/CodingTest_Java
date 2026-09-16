import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			int N = sc.nextInt();
			// 가속도
			int ms = 0;
			// 총 거리
			int m = 0;
			
			for (int i=0; i<N; i++) {
				// 각 초마다
				int command = sc.nextInt();
				// ms 속도 sec 시간
				switch(command) {
					case 0:
						m += ms;
						continue;
					case 1:
						ms += sc.nextInt();
						m += ms;
						continue;
					case 2:
						ms -= sc.nextInt();
						if (ms < 0) ms = 0;
						m += ms;
						continue;
				}
			}
			System.out.printf("#%d %d%n", tc, m);
			
		}	// tc
	}	//main
}