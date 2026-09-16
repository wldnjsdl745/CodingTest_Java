import java.util.Scanner;

class Solution
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			int Nday = sc.nextInt();
			int[] price = new int[Nday];
			long output = 0;
			long start=0;
			
			// 값 넣기
			for (int i=0; i<Nday; i++) {
				price[i] = sc.nextInt();
			}
			
			while(start < Nday) {
				int max = 0;
				int maxIndex = 0;
				
				//  최대값 구하기
				for (int i=(int)start; i<Nday; i++) {
					if (price[i] >= max) {
						max = price[i];
						maxIndex = i;
					}
				}
				
				// 최대값까지 구하기
				if (maxIndex == start) {
					start++;
				} else {
					long sum = 0;
					for (int i=(int)start; i<maxIndex; i++) {
						sum+= price[i];
					}
					output += (long) max * (maxIndex - start) - sum;
					start = maxIndex+1;
				}
			}
			System.out.printf("#%d %d%n", tc, output);
			
		}	// tc
	}	//main
}