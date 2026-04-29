package Day7;

public class BinarySearch {
    public static int binarysearch(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={2,4,6,8,9,13,16,34};
        int target=16;
        int index=binarysearch(arr,target);
        if(index!=-1){
            System.out.println(target+"found at :"+index);
        }
        else{
            System.out.println("Target not found");
        }

    }
}
