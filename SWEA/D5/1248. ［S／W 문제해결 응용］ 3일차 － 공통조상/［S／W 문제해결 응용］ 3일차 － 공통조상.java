import java.util.*;

class Solution
{
	static int V, E;
	static int[] parent;
	static List<Integer>[] children;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			V = sc.nextInt();
			E = sc.nextInt();
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			parent = new int[V+1];
			children = new ArrayList[V+1];
			
			for (int i=1; i<=V; i++) {
				children[i] = new ArrayList<>();
			}
			
			for (int i=0; i<E; i++) {
				int p = sc.nextInt();
				int c= sc.nextInt();
				
				parent[c] = p;
				children[p].add(c);
			}
			
			int A = nearAC(num1, num2);
			int B = findST(A);
			
			System.out.printf("#%d %d %d%n", tc, A, B);
			
			
		}	//tc
		
	}	//main
	
	static int nearAC(int num1, int num2) {
		boolean[] visited = new boolean[V+1];
		
		int check = parent[num1];
		
		// num1이 올라가면서 다 check 누르기
		while (check != 0) {
			visited[check] = true;
			check = parent[check];
		}
		
		// num2 올라가면서 check 다 누르고 만약 check이미 눌려있다면 눌린 그 순간의 부모가 return 값으로 나온다.
		check = parent[num2];
		
		while (check != 0) {
			if (visited[check] == true) {
				return check;
			} else {
			check = parent[check];
			}
		}
		return 0;
	}
	
	static int findST(int num) {
		int cnt = 1;
		for (int i : children[num]) {
			cnt += findST(i);
		}
		return cnt;
	}
}