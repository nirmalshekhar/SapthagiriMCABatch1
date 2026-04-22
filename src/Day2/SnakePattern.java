package Day2;
import java.util.Scanner;
public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        int num=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    a[i][j]=num++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    a[i][j]=num++;
                }
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(a[row][col]+" ");
            }
            System.out.println();
        }
    }
}
