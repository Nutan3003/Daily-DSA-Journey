import java.util.Scanner;
public class logical_operator {
    public static void main(String[] args) {
        //Logical Operator: && ,||  ----->to combines the multiple condition

        // &&  ------>if both condition are true then only it is true

        // ||-------->if any one condition is true then the answer is true

        //read a number if the divisible by 2 or 3 print divisible otherwise  not divisible
        //************************************************* */
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if (x % 2== 0 || x % 3 == 0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not divisible");
        }



    }
    
}
