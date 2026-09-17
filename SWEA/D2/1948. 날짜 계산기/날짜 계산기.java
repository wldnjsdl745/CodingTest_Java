import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			int[] day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			
			int firstMonth = sc.nextInt();
			int firstDay = sc.nextInt();
			int SecondMonth = sc.nextInt();
			int SecondDay = sc.nextInt();
			int result = 0;
			
			if (firstDay>SecondDay) {
				// 첫달
				result += day[firstMonth]-firstDay+1;
				// 그 사이 달
				for (int i=firstMonth+1; i<SecondMonth; i++) {
					result += day[i];
				}
				// 마지막 달
				result += SecondDay;
			} else {
				for (int i=firstMonth; i<SecondMonth; i++) {
					result += day[i];
				}
				result += (SecondDay-firstDay+1);
			}
			
			System.out.printf("#%d %d%n", tc, result);
			
		}	// tc
	}	//main
}