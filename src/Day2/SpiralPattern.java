package Day2;
import java.util.Scanner;
public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int num=1;
        while(top<=bottom && left<=right)
        {
           for(int i=left;i<=right;i++){
               a[top][i]=num++;
           }
           top++;
           for(int i=top;i<=bottom;i++){
               a[i][right]=num++;
           }
           right--;
           for(int i=right;i>=left;i--){
               a[bottom][i]=num++;
           }
           bottom--;
           for(int i=bottom;i>=top;i--){
               a[i][left]=num++;
           }
           left++;
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(a[row][col]+" ");
            }
            System.out.println();
        }
    }
}
