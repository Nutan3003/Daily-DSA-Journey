import java.util.*;
public class IsPalindrome {
    public static boolean isPal(String st){
       int n=st.length();
       char [] arr=new char[n] ;

       for(int i=0;i<n;i++){
        if(st.charAt(i)>='a' && st.charAt(i)<='z'){
            arr[i]=(char)(st.charAt(i)-32);
        }else{
            arr[i]=st.charAt(i);
        }
       }
       int sp=0;
       int ep=n-1;
       while(sp<ep){
        if(arr[sp]!=arr[ep]){
            return false;
        }else{
            sp++;
            ep--;
        }
       }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(isPal(st));
        
    }
}
