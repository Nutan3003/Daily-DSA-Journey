public class fun2 {
    //If the two function having the same name if u changes in one function it can not reflect in another function
    public static void inc(int n){
        n=n+1;
        System.out.println(n);
        return;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(n);
        inc(7);
    }
}
