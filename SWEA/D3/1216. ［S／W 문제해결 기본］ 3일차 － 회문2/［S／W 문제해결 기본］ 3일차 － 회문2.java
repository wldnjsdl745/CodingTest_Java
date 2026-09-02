import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=10; i++) {
            int num = sc.nextInt();
            char[][] cArr = new char[100][100];
            int max =0;

            // 내용 입력
            for (int j = 0; j < 100; j++) {
                cArr[j] = sc.next().toCharArray();
            }

            for (int j=0; j<100; j++){

                for (int k=0; k<100; k++){
                    // 가로
                    for (int l=99; l>=k; l--){
                        boolean check = true;
                        for (int m=0; m<=(l-k)/2; m++){
                            if (cArr[j][k+m] != cArr[j][l-m]){
                                check = false;
                                break;
                            }
                        }
                        if (check){
                            if (max < l-k+1){
                                max = l-k+1;
                            }
                        }
                    }

                    // 세로
                    for (int l=99; l>=k; l--){
                        boolean check = true;
                        for (int m=0; m<=(l-k)/2; m++){
                            if (cArr[k+m][j] != cArr[l-m][j]){
                                check = false;
                                break;
                            }
                        }
                        if (check){
                            if (max < l-k+1){
                                max = l-k+1;
                            }
                        }
                    }
                }
            }

            System.out.printf("#%d %d%n", num, max);
        }   //test_case
    } //main
}