public class swap{
    public static void swapNum(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping value of a is: "+a+" b is: "+b);
        
    
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swaping value of a is: "+a+" b is: "+b);
        swapNum(a, b);

    }
    
}