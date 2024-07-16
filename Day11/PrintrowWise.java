import java.util.Scanner;

public class PrintrowWise {
    public static void printRow(int nums[][]){
        int n=nums.length;
        int m=nums[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    int [][]nums=new int[n][m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            nums[i][j]=sc.nextInt();
        }
    }

    printRow(nums);



}
    
}
