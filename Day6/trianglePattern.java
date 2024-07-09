public class trianglePattern {
    public static void main(String[] args) {
        int nst=1;   // no of print in 1st rows
        for(int i=1;i<=4;i++){//how many no of rows u want to print
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nst=nst+1;
            System.out.println();
        }   
    }
    
}
