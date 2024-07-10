public class factFunction {
    public static int  ncr(int n){
    int ans=1;
    for(int i=1;i<=n;i++){
         ans=ans*i;
    }
    return ans;      //Value will return and function will delete


    }
    public static void main(String[] args) {
        System.out.println(ncr(4));
    }
    
}
