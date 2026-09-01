import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = 10;
		for (int i=1; i<=test_case; i++) {
			int nothing = sc.nextInt();
			int[][] ladder = new int[100][100];
			int startR = 100;
			int startC = 100;
			
			// 사다리 구조 입력
			// 맨 아래 2의 위치 확인
			for (int j=0; j<100; j++) {
				for (int k=0; k<100; k++) {
					ladder[j][k] = sc.nextInt();
					if ( ladder[j][k] == 2) {
						startR = j;
						startC = k;
					}
				}
			}
			
			// 아래부터 거슬러 올라가기 (like 연어)
			while(startR != 0) {
				if (startC > 0 && ladder[startR][startC-1] == 1) {
					startC -= 1;
					ladder[startR][startC] = 0;
					
				} else if (startC < 99 && ladder[startR][startC+1] == 1) {
					startC += 1;
					ladder[startR][startC] = 0;
				} else {         
					startR -= 1;
					ladder[startR][startC] = 0;
				}
				
			}
			
			System.out.printf("#%d %d%n", i, startC);
			
		}
	} //main
}