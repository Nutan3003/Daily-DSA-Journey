import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reverse {
    public static void  reverseString(char[]ch){
        
        int sp=0;
        int ep=ch.length-1;
        while(sp<ep){
            char temp=ch[sp];
            ch[sp]=ch[ep];
            ch[ep]=temp;
            sp++;
            ep--;
        }
      
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
            String st=sc.nextLine();
         char[] ch=st.toCharArray();
        reverseString(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
            
        }
        
       
        
    }
}