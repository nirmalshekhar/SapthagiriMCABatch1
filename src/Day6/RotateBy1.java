package Day6;
import java.util.Arrays;
import java.util.Scanner;
public class RotateBy1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];//Shifting
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
