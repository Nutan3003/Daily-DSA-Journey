import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class re {
    public static void reversePart(int arr[],int s,int e){
        int sp=s;
        int ep=e;
        
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int s=sc.nextInt();
        int e=sc.nextInt();
        reversePart(arr,s,e);
        
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
        
        
        
        
        
    }
}