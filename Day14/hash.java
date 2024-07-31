import java.util.HashMap;
public class hash{
    public static void printfreq(int arr[n],int query[]){
        HashMap <Integer,String> hs=new HashMap<>();
        for(int i=0;i<n;i++){
           int temp= hs.getOrDefault(arr[i],0 );
           hs.put(arr[i],temp+1);
        }

    }
    public static void main(String[] args) {
      int arr[]={2,3,6,2};
    }
}