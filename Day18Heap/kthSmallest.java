import java.util.*;
import java.util.Collection;
import javax.print.attribute.standard.PrintQuality;
public class kthSmallest{
    public static void KthSmall(int arr[],int k){
        int n=arr.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]< pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (pq.size()>0) {
            System.out.println(pq.remove());
            
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        KthSmall(arr,k);
        
    }
}