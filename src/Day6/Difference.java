package Day6;
public class Difference {
    public static void main(String[] args) {
        int []arr={18,10,9,77,45,99};
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Difference :"+(max-min));
    }
}
