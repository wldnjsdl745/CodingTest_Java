import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case=10;

        for (int i=1; i<=test_case; i++) {
            int nothing = sc.nextInt();
            int[][] iArr = new int[100][100];
            int max = 0;

            // 2차원 배열 입력
            for (int j=0; j<100; j++){
                for (int k=0; k<100; k++){
                    iArr[j][k] = sc.nextInt();
                }
            }

            int dCheck = 0;
            int ddCheck = 0;
            for (int j=0; j<100; j++){
                int rCheck = 0;
                int cCheck = 0;
                // 가로, 세로 체크
                for (int k=0; k<100; k++){
                    rCheck += iArr[j][k];
                    cCheck += iArr[k][j];
                }
                // 대각선 체크
                dCheck += iArr[j][j];
                ddCheck += iArr[99-j][j];
                
                // 최대값 체크
                if (rCheck > max){ max = rCheck;}
                if (cCheck > max){ max = cCheck;}
                if (dCheck > max){ max = dCheck;}
                if (ddCheck > max){ max = ddCheck;}
            }

            System.out.printf("#%d %d%n", i, max);
        }
    } //main
}