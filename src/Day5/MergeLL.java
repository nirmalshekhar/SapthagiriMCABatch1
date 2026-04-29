package Day5;
import java.util.Arrays;
import java.util.LinkedList;
public class MergeLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=
                new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> ll2=
                new LinkedList<>(Arrays.asList(6,7,8,9,10));
        ll1.addAll(ll2);
        System.out.println(ll1);

    }
}
