import java.util.*;
public class SumNatural {
    public static int SumNatural(int n){
        return ((n+1)*n)/2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SumNatural(n));

    }
}
