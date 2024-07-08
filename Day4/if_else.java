import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        //if  -----> if some conditon is true then only execute the code
        //else ------> if the if condition is false then only it execute the else statement.
 
        //problem1:Read the number and find the number is even or odd
        Scanner sc= new Scanner(System.in);
        int X=  sc.nextInt();
        //even-->
        if(X%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    
}
