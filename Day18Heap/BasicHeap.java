import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeap{
    public static void main(String args[]){
        //MINIMUM PRIORITY QUEUE
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        //MaxIMUM PRIORITY QUEUE
        PriorityQueue<Integer>pp=new PriorityQueue<>(Collections.reverseOrder());
        
        //To add the element in priority queue(Min priorty elemnts no added in the 1st other are unorder)
        pq.add(3); 
        pq.add(30);
        pq.add(3);    //Duplicate are also allowed

        //To get the minimum number from PQ
       System.out.println( pq.peek());

       //To return and remove the element
       System.out.println(pq.remove());
        
        
    }
}