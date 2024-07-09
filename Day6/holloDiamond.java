public class holloDiamond {
    public static void main(String[] args) {
        int N=7;
        int nst=N/2+1;
        int nsp=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            if(i<=N/2){
                nst=nst-1;
                nsp=nsp+2;
            }
            else{
                nst=nst+1;
                nsp=nsp-2;

            }
            System.out.println();
        }
        
    }
}
