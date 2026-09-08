import java.util.*;

class Solution
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for (int tc = 1; tc <= test_case; tc++) {
			int[] nums = new int[sc.nextInt()];
			
			for (int i=0; i< nums.length; i++) {
				nums[i] = sc.nextInt();
			}
			
			Arrays.sort(nums);
			System.out.print("#" + tc + " ");
			for (int i=0; i< nums.length; i++) {
				System.out.print(nums[i]+ " ");
			}
			
			System.out.println();
			 
		}	//tc
		
	}	// main
}