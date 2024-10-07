

import java.util.LinkedList;
import java.util.Queue;

public class QueueI {
  public static void main(String[] args) {
    Queue<Integer> qe= new LinkedList<>();
    qe.add(10);
    qe.add(20);
    qe.add(30);
    System.out.println(qe.remove(20));
    System.out.println(qe.size());
    System.out.println(qe.peek());
 
    
  }
  
}
