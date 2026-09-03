import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int N, M, max =0;
    static int[][] box;
    static int[] dr = {-1, 0, 1, 0, -1, +1, +1, -1};
    static int[] dc = {0, 1, 0, -1, +1, +1, -1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        for (int i=1; i<=test_case; i++){
            N = sc.nextInt();
            M = sc.nextInt();
            max = 0;
            box = new int[N][N];

            // 박스에 숫자 집어넣기
            for (int j=0; j<N; j++){
                for (int k=0; k<N; k++){
                    box[j][k] = sc.nextInt();
                }
            }

            // 십자가
            for (int j=0; j<N; j++){
                for (int k=0; k<N; k++){
                    calc(j,k);
                }
            }

            System.out.printf("#%d %d%n", i, max);
        }
    } //main
    
    static void calc(int row, int column){
        boolean check = true;
        int thisMax = box[row][column];

        // 십자가
        for (int i=0; i<4; i++){
            for (int j=1; j<M; j++){
                int r = row + (dr[i])*j;
                int c = column + (dc[i])*j;
                if (r<0 || r>=N || c<0 || c>=N){
                    continue;
                }
                thisMax+=box[r][c];
            }
        }
        if (max < thisMax){
            max = thisMax;
        }
        thisMax = box[row][column];

        // X
        for (int i=4; i<8; i++){
            for (int j=1; j<M; j++){
                int r = row + (dr[i])*j;
                int c = column + (dc[i])*j;
                if (r<0 || r>=N || c<0 || c>=N){
                    continue;
                }
                thisMax+=box[r][c];
            }
        }
        if (max < thisMax){
            max = thisMax;
        }
    }   //calc()
}