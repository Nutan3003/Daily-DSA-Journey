import java.util.HashSet;
import java.util.Scanner;

public class DistElement {
    public static int DisttintElement(int arr[]){
        int n=arr.length;
          HashSet<Integer> hm = new HashSet<Integer>();

        for(int i=0;i<n;i++ ){
            hm.add(arr[i]);
        }
        return hm.size();
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(DisttintElement(arr));
    }
}

