import java.lang.*;
import java.util.Scanner;
public class Relational_operator {
    public static void main(String[] args) {
        //Relational operator: >  <  >=   <=  != ==;
        java.util.Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the case which you want to execute:\n1.<\n2.>\n3.>= \n4.<=\n5.==\n6.!=");
        String op=sc.nextLine();
       
        switch(op){
            case "<":
            System.out.println(x<y);
            break;

            case ">":
            System.out.println(x>y);
            break;

            case "<=":
            System.out.println(x<=y);
            break;

            case ">=":
            System.out.println(x>=y);
            break;

            case "==":
            System.out.println(x==y);
            break;

            case "!=":
            System.out.println(x!=y);
            break;

            default:
            System.out.println("Thanks");


        }


        
    }
    
}
