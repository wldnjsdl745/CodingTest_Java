import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc = 1; tc <= test_case; tc++) {
			
			String origin = sc.next();
			int originLenth = origin.length();
			String[] st = origin.split("");
			StringBuilder sb1 = new StringBuilder();
			int size = 0;
			
			for (String s : st) {
				sb1.append(s);
				size++;
				int stLenth = sb1.toString().length();
				StringBuilder sb2 = new StringBuilder();
				for (int i=0; i<(originLenth/stLenth); i++){
					sb2.append(sb1.toString());
				}
				if (originLenth%stLenth != 0) {
					for (int i=(stLenth*(originLenth/stLenth)); i<originLenth; i++) {
						sb2.append(st[i]);
					}
				}
				if (origin.equals(sb2.toString())) break;
			}
			System.out.printf("#%d %d%n", tc, size);
			
		}	//tc
		
	}	// main
}