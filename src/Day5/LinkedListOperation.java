package Day5;
import java.util.LinkedList;
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.addFirst(40);
        System.out.println(ll);
        ll.addLast(50);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        System.out.println("Size :" +ll.size());
    }
}
