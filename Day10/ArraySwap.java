import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySwap {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int idx1=sc.nextInt();
        int idx2=sc.nextInt();
        
         int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}