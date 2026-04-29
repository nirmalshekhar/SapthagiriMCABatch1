package Day6;
public class MaxElement {
    public static void main(String[] args) {
        int []arr={18,1,10,77,45,17};
        //Assume first element as max
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];//Update max
            }
        }
        System.out.println("Maximum element:"+max);
    }
}
