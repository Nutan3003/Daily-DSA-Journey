public class contniue_stat {
    public static void main(String[] args) {
        //continue: if thie condition is correct the skip that condition only
        int n=5; 
        for(int i=1;i<=5;i++){
            if(i==2 && i==3){continue;}
            
            System.out.println(i);
        }
    }
    
}
