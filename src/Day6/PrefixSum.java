package Day6;
import java.util.Arrays;
import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Prefix Sum Logic
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
