import java.util.*;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			
			char[] cArr = sc.next().toCharArray();
			int cnt = 0;
			Stack<Character> s = new Stack<>();
			
			for (int i=0; i<cArr.length; i++) {
				if (cArr[i] == '(') {
					s.push(cArr[i]);
				} else if (cArr[i] == ')') {
					s.pop();
					
					if (cArr[i-1] == '(') {
						cnt+= s.size();
					} else {
						cnt++;
					}
					
				}
			}
			
			System.out.printf("#%d %d%n", tc, cnt);
		}	// tc
	}	// main
}