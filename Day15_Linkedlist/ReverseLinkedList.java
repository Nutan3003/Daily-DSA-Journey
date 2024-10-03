class Node {
  int val;
  Node next;

  Node(int v1) {
    val = v1;
  }
}
public class ReverseLinkedList {

  public static void PrintLinkedList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }
   
  

  public static Node ReverseLL(Node head){
    Node prev=null;
    Node curr=head;
    while(curr!=null){
      Node currp1=curr.next;
      curr.next=prev;
      prev =curr;
      curr=currp1;
    }
    return prev;
  }
public static void main(String[] args) {
  Node n1 = new Node(10);
  Node n2 = new Node(20);
  Node n3 = new Node(30);
  Node n4 = new Node(40);

  Node head = n1;
  n1.next = n2;
  n2.next = n3;
  n3.next = n4;

 head=ReverseLL(head);
 PrintLinkedList(head);
 
  
}

  
}
