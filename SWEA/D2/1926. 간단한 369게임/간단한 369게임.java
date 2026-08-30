import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        for (int i=1; i<=N; i++) {
            String s = String.valueOf(i);
            if (s.contains("3") || s.contains("6") || s.contains("9")) {
                String[] sArr = s.split("");
                for (int j = 0; j < sArr.length; j++) {
                    if (sArr[j].equals("3") || sArr[j].equals("6") || sArr[j].equals("9")) {
                        sArr[j] = "-";
                    } else {
                        sArr[j] = "";
                    }
                }
                s = String.join("", sArr);
            }
            System.out.printf("%s ", s);
        }
    } //main
}