import java.util.Scanner;

public class PrintColZig {
    public static void ColZig(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;

        for(int j=0;j<m;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i][j]+" ");

                }
            }
            else{
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    int [][]nums=new int[n][m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            nums[i][j]=sc.nextInt();
        }
    }

    ColZig(nums);
    }
    
}
