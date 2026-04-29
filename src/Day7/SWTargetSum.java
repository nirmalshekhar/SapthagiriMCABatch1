package Day7;
import java.util.Arrays;
public class SWTargetSum {
    public static int[] TargetSumIndex(int []arr,int k,int target){
        int sum=0;
        //first window
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum==target){
            return new int[]{0,k-1};
        }
        for(int i=k;i< arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if(sum==target){
                return new int[]{i-k+1,i};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int []arr={1,2,5,7,3,4,6};
        int k=3;//Window Size
        int target=13;
        int []result=TargetSumIndex(arr,k,target);
        System.out.println(Arrays.toString(result));
    }
}
