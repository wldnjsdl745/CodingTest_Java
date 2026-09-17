import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			// N줄
			int N = sc.nextInt();
			List<String> sentence = new ArrayList<>();
			
			for (int i=0; i<N; i++) {
				String s = sc.next();
				int num = sc.nextInt();
				for (int j=0; j<num; j++) {
					sentence.add(s);
				}
			}
			int size = sentence.size();
			
			System.out.println("#" + tc);
			for (int i=0; i<size; i++) {
				System.out.print(sentence.get(0));
				sentence.remove(0);
				if (i%10 == 9) {
					System.out.println();
				}
			}
			System.out.println();
		}	// tc
	}	//main
}