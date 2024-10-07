

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
  public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    Stack<Integer> st= new Stack<>();
    for(int i=0;i<k;i++){
      st.push(q.remove());
    }

    for(int i=0;i<k;i++){
      q.add(st.pop());
    }

    for(int i=0;i<q.size()-k;i++){
      q.add(q.remove());
    }

    return q;

  }
  public static void main(String[] args) {
    Queue<Integer> q= new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    int k=4;
  System.out.println(modifyQueue(q, k));
 
    
  }
  
}

