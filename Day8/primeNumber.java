import java.util.Scanner;
public class primeNumber{
    public static String isPrime(int n){
        int count=0;
        for(int i=1;i<=n/i;i++){
            if(n%i==0){
                if(i==n/i){
                    count=count+1;
                }else{
                    count=count+2;
                }
            }
        }
        if(count==2){
            return "Prime";
        }else{
            return"Not Prime";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        
    }
}