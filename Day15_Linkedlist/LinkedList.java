
class Node {
  int val;
  Node next;

  Node(int v1) {
    val = v1;
  }
}

public class LinkedList {
  public static void PrintLinkedList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  public static Node InsertHead(Node head, int val) {
    Node newNode = new Node(val);

    newNode.next = head;
    return newNode; // Return the new head
  }

  public static Node InsertEnd(Node head,int val){
   
    Node newNode = new Node(val);
    //edge case
    if (head == null) {
      return newNode;
    }
    Node temp=head;
    while(temp.next != null){
      temp=temp.next;
    }
    temp.next=newNode;
    return head;

  }
  public static Node InsertAt(Node head ,int val,int k){
    Node Newnode= new Node(val);
 
    if (k == 1) {
      Newnode.next = head; // Insert at the head if position is 1
      return Newnode;
    }
    Node temp=head;
    for(int i=0;i<k-1 && temp != null;i++){
      temp=temp.next;
    }

    if (temp == null) {
      System.out.println("Position out of bounds");
      return head; // If `k` is greater than the length of the list
    }

    Node temp1=temp.next;
    temp.next=temp;
    Newnode.next=temp1;
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
    // (n1 -> n2 -> n3 -> n4)
    
    // Inserting at head
    head = InsertHead(head, 60);
    //Inserting at the middle
    head=InsertAt(head, 900, 3);
    //Inserting at the end
    head= InsertEnd(head, 100);
    
    // Printing the linked list values
    PrintLinkedList(head);
  }
}
