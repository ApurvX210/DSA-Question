import java.util.Stack;

public class validparenthesis {
    static int maxLength(String S) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                s.push('(');
            } else if (S.charAt(i) == ')') {
                if (s.size() == 0) {
                    ans = Integer.max(ans, count);
                    count = 0;
                    continue;
                }
                if (s.peek() == '(') {
                    count += 2;
                    System.out.println(count);
                    if(i==S.length()-1){
                        ans=Integer.max(ans, count);
                    }
                    s.pop();
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "))((((())))()())()))()(()))((((()))((()())())()(())))(()()))((((()(((()(((((((())(()))(()(()))(())))(((()()()()))(()()()())((()()((()()))())))((()())()(()))))))(((())))()(()))())()()())(()(()()))())(()))))(()(())(()()())))(()()))(()))()()()(())())())()))(()(()(()(((())))()))())))))()))())()()()()(())())()(()())(())())((()()))))(())()((()())()(()(()))(((((()()(())((()))()(())(()(()())))()()(()()))())))(()))()(())()(()(()()))))(()(((()(()(())()()(()()))))))(()((())))()())((()()((((((()))(()))(()((())()(((())()()(()(())))((()(((((()()((()()))((((()(((())))((()))()))())))))()))()()()((((()(((()()())())))))))(()())))()()()()()))))()(()(((())()))))()((()))())()())))((()))))))))((()())()()()))(()()())())())(((()))))(()())))(())(((()(())(((()(()(())(())()()))((()))())((()))()))))))()((())((())((((()(()((((()))))()()(()(()((())()()((()())())()(()()()())(((())(()))((()())((())((()()((()(()()()()()((()))(()))(()((()()())())(())(())())(()(())((((()(()()((()(()(())((()()(()()))))((()())))(())((()))((()((((((()))((((((()()()())()()()(((()())((()))()))()((((()(()(()))()(((())((((((()()()()))()())((())(((((()))(((()()))()))()((()(())))()())(())()(((()((()())()())(())(()())()()()()()))(()()))()()((()))())(()(((()(())()(()()())))()))())(()))((()((()))()))())()))))()))()))()((())()()(())(())())(((())())))((())))((()()())(()))((((()))))())()))(((((()(()(()(((())()))())(()((((())))()))()))((())()))))())((())()()(()))()()())((())()((()())()))))()))()()(()))())(())))()(()(()((((()()))(((()()()))))((()(()))(())(()))((()())(()((()))()(()))()))())((()((())))(((())))(()(((((((()))(()))))))(()(()(((((()))))(()))(())())())))()))()((()(()((((((()((((())())))(()()()))())))((()((())()))(((())(())((()(((())(()))))((()))(()((((()))))((()))())()((()(())()()()((()(((()((()(()()(()))))()((((())()()()))()()))((((())(())()))))())(()((())()())))())())(()((())()(()()((()()(()(((()((())((((()()((()))())(((()))()(()((()))()()))()))())))(()))))(()()(()(())())))))(()(()(()(()";
        System.out.println(maxLength(s));
    }
}
