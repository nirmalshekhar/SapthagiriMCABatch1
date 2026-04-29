package Day7;
//Linear search -> performed on sorted and unsorted both
//Time -> O(n)
public class LinearSearch {
    public static int linearsearch(int []arr1,int key){
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={18,7,45,77,17,1};
        int target=17;
        int index=linearsearch(arr,target);
        if(index !=-1){
            System.out.println(target+" is found at :"+index);
        }
        else {
            System.out.println("target not found");
        }
    }
}
