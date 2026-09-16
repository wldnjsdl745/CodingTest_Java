import java.util.Scanner;
import java.util.*;

class Solution{
    	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc=1; tc<=test_case; tc++) {
			
			byte[] decodedBytes = Base64.getDecoder().decode(sc.next());
			String result = new String(decodedBytes);
			
			System.out.printf("#%d %s%n", tc, result);
			
		}	// tc
	}	//main
}