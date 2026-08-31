import java.util.Scanner;


class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();

        for (int i=1; i<=test_case; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] iArr = new int[N][N];
            int maxSum = 0;

            // 배열 입력
            for (int j=0; j<N; j++){
                for (int k=0; k<N; k++){
                    iArr[j][k] = sc.nextInt();
                }
            }

            // M크기
            for (int j=0; j<(N-M+1); j++){
                for (int k=0; k<(N-M+1); k++){
                    // 파리채 크기
                    int sum = 0;
                    for (int l=0; l<M; l++){
                        for (int m=0; m<M; m++){
                            sum += iArr[j+l][k+m];
                        }
                    }
                    if (sum > maxSum){maxSum = sum;}
                }
            }
            System.out.printf("#%d %d%n", i, maxSum);

        }
    } //main
}