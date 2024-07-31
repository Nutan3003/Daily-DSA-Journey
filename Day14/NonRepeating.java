import java.util.*;
public class NonRepeating {
    public static int nonRep(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:arr){
            if(hm.containsKey(num)==true){
                int temp=hm.get(num);
                hm.put(num,temp+1);
            }
            else{
                hm.put(num,1);
            }
        }

        for(int num:arr){
            if(hm.get(num)==1){
                return num;

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(nonRep(arr));
    }
    
}
