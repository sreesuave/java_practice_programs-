package mock_codings;
import java.util.*;

public class Parenthis {

    public static boolean valid_braces(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[' || ch == '<') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']' || ch == '>') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[') ||
                    (ch == '>' && top != '<')) {
                    return false;
                }
            } else {
                // Invalid character
                return false;
            }
        }

        // ✅ Return true only if all brackets matched and stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(valid_braces(input));
    }
}
