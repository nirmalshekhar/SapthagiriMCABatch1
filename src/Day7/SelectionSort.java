package Day7;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionsort(int []arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={77,18,45,17,10,63};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
