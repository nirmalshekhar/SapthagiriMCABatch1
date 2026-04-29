package Day6;
public class MinElement {
    public static void main(String[] args) {
        int []arr={18,1,10,77,45,17};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element :"+min);
    }
}
