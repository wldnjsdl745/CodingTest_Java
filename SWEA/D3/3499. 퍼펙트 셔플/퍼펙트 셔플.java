import java.util.*;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for (int tc = 1; tc <= test_case; tc++) {
			int N = sc.nextInt();
			Deque<String> q1 = new ArrayDeque<>();
			Deque<String> q2 = new ArrayDeque<>();
			Deque<String> q3 = new ArrayDeque<>();
			
			for (int i=0; i<(N+1)/2; i++) {
				q1.add(sc.next());
			}
			
			for (int i=(N+1)/2; i<N; i++) {
				q2.add(sc.next());
			}
			
			for (int i=0; i<N; i++) {
				if(i%2 == 0) {
					q3.add(q1.removeFirst());
				} else {
					q3.add(q2.removeFirst());
				}
			}
			
			System.out.print("#" + tc + " ");
			for (int i=0; i<N; i++) {
				System.out.print(q3.removeFirst() + " ");
			}
			System.out.println();
		}	//tc
	}	// main
}