import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindPair {
    public static boolean isPair(int arr[],int k){
        int n=arr.length;
       HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:arr){
            if(hm.containsKey(num)==true){
                int temp=hm.get(num);
                hm.put(num,temp+1);
            }
            else{
                hm.put(num,1);
            }
        }
        for(int i=0;i<n;i++){
            int a=arr[i];
            int b=k-a;
            
            if(hm.containsKey(b)==true && a!=b){
                return true;
            }
            else if(a==b  && hm.get(b)>=2){
                return true;
            }
            
        }
        return false;
        
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(isPair(arr,k));
    }
}