import java.util.*;

public class RemoveAdjacentDuplicate {
  public static String  Remove(String str){
        Stack <Character> st= new Stack();
        for(int i=0;i<str.length();i++){
          if(st.size()==0 || st.peek() != str.charAt(i)){
            st.push(str.charAt(i));
          }
          else{
            st.pop();
          }
        }
        // StringBuilder result = new StringBuilder();
        // while (!st.isEmpty()) {
        //     result.append(st.pop());  // Pop from the stack to reverse the string
        // }

        // return result.toString();  // Return the reversed result
        StringBuilder result = new StringBuilder();
        for (Character c : st) {
            result.append(c);  // Append characters from the stack in their natural order
        }

        return result.toString(); 
    }
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String result = Remove(str);
        System.out.println("Result after removing adjacent duplicates and reversing: " + result);
  }
}
