import java.util.*;
public class RotateArray {
    public static  void Rotate(int arr[],int s,int e){

        int sp=s;
        int ep=e;

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
        Scanner sc= new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before swap");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
         
        //Reverse hole array
        Rotate(arr, 0, n-1);
        
       

        // int s=sc.nextInt();
        // int e=sc.nextInt();

        System.out.println("\nArray After swap:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }

        
        
       System.out.println("\nNo of iterations");
        int k=sc.nextInt();
        k = k%n;

        System.out.println("Reverse upto the k elements");
        Rotate(arr, 0, k-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }

         System.out.println("\nFinal answer");
         Rotate(arr, k, arr.length-1);

         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }

        
    }
}
