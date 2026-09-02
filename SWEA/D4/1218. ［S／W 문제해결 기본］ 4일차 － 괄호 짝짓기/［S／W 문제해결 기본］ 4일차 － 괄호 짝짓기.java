import java.util.*;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = 10;

        for (int i=1; i<= test_case; i++){
            int size = sc.nextInt();
            Stack<Character> s = new Stack<>();
            char[] cArr = sc.next().toCharArray();
            boolean check = true;

            for (char ch : cArr){
                if (ch == '(' || ch == '[' || ch == '{' || ch == '<'){
                    s.push(ch);
                }
                if (ch == ')' || ch == ']' || ch == '}' || ch == '>'){
                    if (s.isEmpty()){
                        check = false;
                        break;
                    }
                    if (ch == ')'){
                        if (s.peek() != '('){
                            check = false;
                        } else { s.pop(); }
                    }
                    if (ch == ']'){
                        if (s.peek() != '['){
                            check = false;
                        } else { s.pop(); }
                    }
                    if (ch == '}'){
                        if (s.peek() != '{'){
                            check = false;
                        } else { s.pop(); }
                    }
                    if (ch == '>'){
                        if (s.peek() != '<'){
                            check = false;
                        } else { s.pop(); }
                    }
                }
            }

            if (check){
                System.out.printf("#%d 1%n", i);
            } else {
                System.out.printf("#%d 0%n", i);
            }

        }   // test_case
    } //main
}