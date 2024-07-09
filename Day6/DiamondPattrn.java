public class DiamondPattrn {
    public static void main(String[] args) {
        int N=5;
        int nst=1;
        int nsp=N/2;
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            } 

            if(i<=N/2){
                nst=nst+2;
                nsp--;
            }else{
                nst=nst-2;
                nsp++;
            }
            System.out.println();

        }
    }
}
