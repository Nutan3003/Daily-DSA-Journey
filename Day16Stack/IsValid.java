import java.util.*;
import java.util.Stack;

public class IsValid {
    public static boolean ValidPar(String str) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  

            if (st.size() == 0 || ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            
            // Handle closing brackets
            else {
                if (ch == ')') {
                    if (st.isEmpty() || st.pop() != '(') return false;  // Check for matching '('
                } 
                else if (ch == ']') {
                    if (st.isEmpty() || st.pop() != '[') return false;  // Check for matching '['
                } 
                else if (ch == '}') {
                    if (st.isEmpty() || st.pop() != '{') return false;  // Check for matching '{'
                }
            }
        }

        // Return true if stack is empty, false if there are unmatched opening brackets
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ValidPar(str));
    }
}
