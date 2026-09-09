import java.util.*;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int test_case = sc.nextInt();
			Deque<Integer> q = new ArrayDeque<>();
			int minus = 1;
			boolean check = true;
			
			for (int i=0; i<8; i++) {
				q.addLast(sc.nextInt());
			}
			
			while (check) {
				for (int i=0; i<5; i++) {
					int last = q.removeFirst()-minus;
					minus++;
					q.addLast(last);
					if (last <= 0) {
						q.removeLast();
						q.addLast(0);
						check = false;
						break;
					}
				}
				minus = 1;
			}
			
			System.out.print("#" + tc + " ");
			for (int i=0; i<8; i++) {
				System.out.print(q.removeFirst() + " ");
			}
			System.out.println();
			 
		}	//tc
		
	}	// main
}