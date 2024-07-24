 import java.util.*;
public class DifferenceAscii {
    public static String Difference(String st){
        String ans="";
        int n=st.length();
        for(int i=0;i<n-1;i++){
            ans=ans+st.charAt(i);
            int temp=st.charAt(i+1)-st.charAt(i);
            ans=ans+temp;
        }
        ans=ans+st.charAt(n-1);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(Difference(st));


    }
    
}
