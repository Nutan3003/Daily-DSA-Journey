class Node {
  int val;
  Node next;

  Node(int v1) {
    val = v1;
  }
}
public class DeleteLinkedList {
  public static void PrintLinkedList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  public static Node DeleteEnd(Node head){
    if (head == null || head.next == null) {
      return null; // List is empty or has one node
    }
    Node temp=head;
    while(temp.next.next!=null){
      temp=temp.next;
    }
    temp.next=null;

    return head;
  }
  public static Node DeleteAt(Node head, int k) {
    if (head == null) {
      System.out.println("List is empty.");
      return null; // If the list is empty, return null
    }

    if (k == 1) {
      return DeleteHead(head); // If position is 1, delete the head node
    }

    Node temp = head;
    // Traverse to the (k-1)th node
    for (int i = 1; i < k - 1 && temp != null; i++) {
      temp = temp.next;
    }

    if (temp == null || temp.next == null) {
      System.out.println("Position out of bounds.");
      return head; // If position is greater than the number of nodes
    }

    // Delete the kth node by skipping it
    temp.next = temp.next.next;

    return head;
  }


  public static Node DeleteHead(Node head){
    if (head == null) {
      return null; // If the list is empty, return null
    }
    head=head.next;
    return head;
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

    head=DeleteEnd(head);
    head=DeleteAt(head, 3);
    head=DeleteHead(head);
    PrintLinkedList(head);
    
  }
}
