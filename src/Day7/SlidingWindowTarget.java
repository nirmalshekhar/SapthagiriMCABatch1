package Day7;
public class SlidingWindowTarget {
    public static boolean TargetSum(int []arr,int k,int target){
       int ws=0;
       for(int i=0;i<k;i++){
           ws+=arr[i];
       }
       if(ws==target)return true;
       for(int i=k;i<arr.length;i++){
           ws+=arr[i]-arr[i-k];
           if(ws==target)return true;
       }
       return false;
    }
    public static void main(String[] args) {
        int []arr={1,2,5,7,3,4,6};
        int k=3;//Window Size
        int target=13;
        boolean result=TargetSum(arr,k,target);
        if(result){
            System.out.println("Target SUm is found");
        }
        else {
            System.out.println("Target SUm doesn't exist");
        }

    }
}
