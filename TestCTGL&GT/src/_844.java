import java.util.Stack;


//https://leetcode.com/problems/backspace-string-compare/
public class _844 {

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> string = new Stack();
        Stack<Character> string2 = new Stack();

        int i;
        for(i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '#') {
                string.add(s.charAt(i));
            } else if (!string.isEmpty()) {
                string.pop();
            }
        }

        for(i = 0; i < t.length(); ++i) {
            if (t.charAt(i) != '#') {
                string2.add(t.charAt(i));
            } else if (!string2.isEmpty()) {
                string2.pop();
            }
        }

        boolean result = true;
        if (string.size() != string2.size()) {
            return false;
        } else if (string.isEmpty()) {
            return true;
        } else {
            while(!string.isEmpty() && !string2.isEmpty()) {
                if (string.pop() != string2.pop()) {
                    result = false;
                    break;
                }

                result = true;
            }

            return result;
        }
    }
}
