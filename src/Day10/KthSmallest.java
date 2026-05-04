package Day10;
import java.util.Arrays;
import java.util.PriorityQueue;
public class KthSmallest {
    public static void main(String[] args) {
        int k=3;
        PriorityQueue<Integer> pq=
                new PriorityQueue<>(Arrays.asList(7,10,15,4,20,3,13));
        int result=0;
        for(int i=0;i<k;i++){
            result=pq.poll();
        }
        System.out.println("Kth smallest element :"+result);
    }
}
