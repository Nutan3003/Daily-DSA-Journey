import java.util.*;
public class FindUnique {
    public static int Unique(int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){

            ans=ans^ arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={10,4,8,10,9,4,8};
        System.out.println(Unique(arr));
    }
    
}
