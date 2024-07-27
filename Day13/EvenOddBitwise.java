import java.util.*;
public class EvenOddBitwise {
    public static boolean isEvenOdd(int n){
        if((n & 1 )== 0){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEvenOdd(n));
    }
}
