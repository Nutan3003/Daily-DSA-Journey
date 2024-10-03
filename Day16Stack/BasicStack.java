import java.util.Stack;
public class BasicStack{
  public static void main(String[] args) {
    Stack <Integer> st= new Stack();
    //Add the lement in the stack
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println(st);
    //Get the size of the stack 
    System.out.println(st.size());
    //Pop the element in the stack and return 
    int val=st.pop();
    System.out.println(val);
    //pick the top elelment in the stack
    System.out.println(st.peek());
  }
}