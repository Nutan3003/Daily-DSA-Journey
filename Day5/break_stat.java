import java.util.Scanner;
public class break_stat {
    public static void main(String[] args) {
        // if given condition is found the it will break there
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1
        ;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }

    }
    
}
