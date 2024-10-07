
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Queue;

public class Solution {
    public static String isPalindrome(int k){
      Queue<String> qe=new LinkedList<>();
      Int
      qe.add("11");
      qe.add("22");
      for(int i=1;i<=k;i++){
        String rem=qe.remove();
        if(i==k){
          return rem;
        }
        int n=rem.length()/2;
        String left=rem.substring(0,n);
        String right=rem.substring(n,rem.length());

        qe.add(left+"11"+right);
        qe.add(left+"22"+right);
      }

      return " ";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        String ans=isPalindrome(k);
        System.out.println(ans);
        
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}