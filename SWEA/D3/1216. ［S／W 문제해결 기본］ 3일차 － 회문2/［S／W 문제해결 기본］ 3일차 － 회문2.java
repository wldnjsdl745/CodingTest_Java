import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=10; i++) {
            int num = sc.nextInt();
            char[][] cArr = new char[100][100];
            int max = 0;

            // 내용 입력
            for (int j = 0; j < 100; j++) {
                cArr[j] = sc.next().toCharArray();
            }

            for (int j=0; j<100; j++){

                for (int k=0; k<100; k++){
                    // 가로
                    for (int l=99; l>=k; l--){
                        StringBuilder sb1 = new StringBuilder();
                        for (int m=k; m<=l; m++){
                            sb1.append(cArr[j][m]);
                        }
                        if (sb1.toString().equals(sb1.reverse().toString())){
                            if (max < l-k+1){
                                max = l-k+1;
                            }
                            break;
                        }
                    }

                    // 세로
                    for (int l=99; l>=k; l--){
                        StringBuilder sb2 = new StringBuilder();
                        for (int m=k; m<=l; m++){
                            sb2.append(cArr[m][j]);
                        }
                        if (sb2.toString().equals(sb2.reverse().toString())){
                            if (max < l-k+1){
                                max = l-k+1;
                            }
                            break;
                        }
                    }
                }
            }

            System.out.printf("#%d %d%n", num, max);
        }   //test_case
    } //main
}