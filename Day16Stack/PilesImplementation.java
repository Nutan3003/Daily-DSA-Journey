class Node{
  int val ;
  Node Next;
  Node(int v1){
    val=v1;
    Next=null;
  }
}
 class LinkedListAsStack{
  private Node head;

  LinkedListAsStack(){
    head=null;
  }

  public void push(int value){
    Node n1= new Node(value);
    n1.Next=head;
    head=n1;
    System.out.println(value+ " :pushed in the stack");

  }
  public int pop(){
    if(head==null){
      System.out.println("Stack is empty");
      return -1;
    }
    int value = head.val;
    head=head.Next;
    return value;
  }

  public int peek(){
    if(head==null){
      System.out.println("Stack is empty");
      return -1;
    }
    return head.val;

  }
  public boolean isEmpty() {
    return head == null;
}

}
public class PilesImplementation {


  public static void main(String[] args) {
    LinkedListAsStack st= new LinkedListAsStack();
    st.push(10);
    st.push(20);
    System.out.println(st.pop());
    System.out.println(st.peek());
    System.out.println("Is stack empty? " + st.isEmpty());
   
    
  }
  
}
