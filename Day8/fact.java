public class fact{
    public static  int factCount(int n){
       //#Burst force solution
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // return count;

        //#Optimized solutions
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
        return count;
    }
    public static void main(String[] args) {
     System.out.println(factCount(36));
    
    }

    }