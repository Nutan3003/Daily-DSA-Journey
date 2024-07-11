import java.util.Scanner;
//Dry : Donot Repeat Yourself
public class ncr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans1=1;
        for(int i=1;i<=n;i++){
            ans1=ans1*i;
        }
        int ans2=1;
        for(int i=1;i<=r;i++){
            ans2=ans2*i;
        }
        int ans3=1;
        for(int j=1;j<=n-r;j++){
            ans3=ans3*j;
        }
        int ans=ans1/(ans2*ans3);
        System.out.println(ans);
    }
    
}
