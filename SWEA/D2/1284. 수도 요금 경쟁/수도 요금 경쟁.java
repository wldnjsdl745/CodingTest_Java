
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();

        for (int i=1; i<=test_case; i++){
            // 변수 입력
            int P = sc.nextInt();   // A사는 1리터당 P원 요금
            int Q = sc.nextInt();   // B사는 기본요금이 Q원
            int R = sc.nextInt();   // B사는 R리터 이하인 경우 기본요금만 낸다.
            int S = sc.nextInt();   // B사가 R양보다 많은 양을 사용하면 1리터당 S원의 요금을 더 내야 한다.
            int W = sc.nextInt();   //종민이가 쓴 수도의 양 W리터

            // A사의수도 요금
            int aCost = W*P;
            int bCost = Q;
            if (W > R) {
                bCost += (W-R)*S;
            }
            int cost = (aCost <= bCost) ? aCost : bCost;
            System.out.printf("#%d %d%n", i, cost);
        }
    }
}