public class trianglePattrnNumber {
    public static void main(String[] args) {
        int N=5;
        int nst=1;
        int count=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(count+" ");
                count++;
            }
            nst++;
            System.out.println();
        }
    }
    
}
