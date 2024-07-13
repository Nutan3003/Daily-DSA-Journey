import java.util.*;
public class reverseArray {
    public static void reverse(int arr[]){
       int sp=0;
       int ep=arr.length-1;
      while(sp<ep){
        int temp=arr[sp];
        arr[sp]=arr[ep];
        arr[ep]=temp;
        sp++;
        ep--;
      }
        return;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before swap");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
System.out.println("After swap");
       reverse(arr);

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
        
    }
    
}
