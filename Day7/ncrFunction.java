import java.util.Scanner;
public class ncrFunction {
    public static int ncr(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int ans1=ncr(n);
        int ans2=ncr(r);
        int ans3=ncr(n-r);


        int ans=ans1/(ans2*ans3);
        System.out.println(ans);

        
    }

    //Note: You can have a no output of function then you have void return type of function.
    
}
