import java.util.*;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int test_case = sc.nextInt();
			Queue<Integer> q = new ArrayDeque<>();
			int minus = 1;
			
			for (int i=0; i<8; i++) {
				q.offer(sc.nextInt());
			}
			
			while (true) {
				int num = q.remove() - minus;
				if (num <= 0) {
					q.add(0);
					break;
				}
				
				q.add(num);
				minus++;
				
				if (minus > 5) {
					minus =1;
				}
			}
			
			System.out.print("#" + test_case + " ");
			while(!q.isEmpty()) {
				System.out.print(q.remove() + " ");
			}
			System.out.println();
			 
		}	//tc
		
	}	// main
}